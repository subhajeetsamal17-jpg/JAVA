import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double salary;


    static String companyName = "ABC Technologies";

    
    Employee() {
        empId = 0;
        name = "Unknown";
        salary = 0.0;
    }


    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName);
        System.out.println();
    }
}


public class Q4{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            emp[i] = new Employee(id, name, salary);
        }

        System.out.println("\n===== EMPLOYEE DETAILS =====");

        for (int i = 0; i < n; i++) {
            emp[i].display();
        }
    }
}