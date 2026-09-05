import java.util.Scanner;

class Consumer {
    int consumerId;
    String consumerName;
    double unitsConsumed;

    
    static double perUnitRate;

    
    Consumer(int consumerId, String consumerName, double unitsConsumed) {
        this.consumerId = consumerId;
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    
    double calculateBill() {
        return unitsConsumed * perUnitRate;
    }

    
    void display() {
        System.out.println("Consumer ID: " + consumerId);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Per Unit Rate: " + perUnitRate);
        System.out.println("Electricity Bill: " + calculateBill());
        System.out.println();
    }
}


public class Q8{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter per-unit electricity rate: ");
        Consumer.perUnitRate = sc.nextDouble();

        System.out.print("Enter number of consumers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Consumer[] consumers = new Consumer[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Consumer " + (i + 1));

            System.out.print("Enter Consumer ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Consumer Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Units Consumed: ");
            double units = sc.nextDouble();

            consumers[i] = new Consumer(id, name, units);
        }

        
        System.out.println("\n===== CONSUMER DETAILS =====");

        for (int i = 0; i < n; i++) {
            consumers[i].display();
        }

        
        int highest = 0;

        for (int i = 1; i < n; i++) {
            if (consumers[i].calculateBill() >
                consumers[highest].calculateBill()) {
                highest = i;
            }
        }

        System.out.println("===== HIGHEST ELECTRICITY BILL =====");
        consumers[highest].display();
    }
}