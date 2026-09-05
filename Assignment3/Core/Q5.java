import java.util.Scanner;

class Patient {
    int patientId;
    String name;
    int age;


    Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    
    void display() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        Patient[] patients = new Patient[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Patient " + (i + 1));

            System.out.print("Enter Patient ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            patients[i] = new Patient(id, name, age);
        }

        
        System.out.println("\n===== ALL PATIENT DETAILS =====");

        for (int i = 0; i < n; i++) {
            patients[i].display();
        }

        
        System.out.print("Enter age limit: ");
        int limit = sc.nextInt();

        int count = 0;

        
        for (int i = 0; i < n; i++) {
            if (patients[i].age > limit) {
                count++;
            }
        }

        System.out.println("\nNumber of patients older than " + limit + ": " + count);


        System.out.println("\n===== PATIENTS ABOVE AGE LIMIT =====");

        for (int i = 0; i < n; i++) {
            if (patients[i].age > limit) {
                patients[i].display();
            }
        }
    }
}