
import java.util.Scanner;

abstract class Consumer {

    int consumerId;
    String consumerName;
    double unitsConsumed;

    Consumer(int consumerId, String consumerName, double unitsConsumed) {
        this.consumerId = consumerId;
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    abstract double calculateBill();

    void displayDetails() {
        System.out.println("Consumer ID: " + consumerId);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: Rs. " + calculateBill());
    }
}

class DomesticConsumer extends Consumer {

    DomesticConsumer(int consumerId, String consumerName, double unitsConsumed) {
        super(consumerId, consumerName, unitsConsumed);
    }

    double calculateBill() {
        return unitsConsumed * 5;
    }
}

class CommercialConsumer extends Consumer {

    CommercialConsumer(int consumerId, String consumerName, double unitsConsumed) {
        super(consumerId, consumerName, unitsConsumed);
    }

    double calculateBill() {
        return unitsConsumed * 8;
    }
}

class Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Domestic Consumer Details:");
        System.out.print("Consumer ID: ");
        int id1 = sc.nextInt();

        sc.nextLine();

        System.out.print("Consumer Name: ");
        String name1 = sc.nextLine();

        System.out.print("Units Consumed: ");
        double units1 = sc.nextDouble();

        System.out.println();

        System.out.println("Enter Commercial Consumer Details:");
        System.out.print("Consumer ID: ");
        int id2 = sc.nextInt();

        sc.nextLine();

        System.out.print("Consumer Name: ");
        String name2 = sc.nextLine();

        System.out.print("Units Consumed: ");
        double units2 = sc.nextDouble();

        Consumer c;

        c = new DomesticConsumer(id1, name1, units1);

        System.out.println("\n--- Domestic Consumer ---");
        c.displayDetails();
        

        c = new CommercialConsumer(id2, name2, units2);

        System.out.println("\n--- Commercial Consumer ---");
        c.displayDetails();
        

        sc.close();
    }
}
