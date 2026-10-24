import java.util.Scanner;

class Student {
    String name;
    int roll_no;
    String branch;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        roll_no = sc.nextInt();
		sc.nextLine();
        System.out.print("Enter Branch: ");
        branch = sc.nextLine();
    }

   
    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Branch: " + branch);
    }
}

public class Q1{
    public static void main(String[] args) {

        Student s = new Student();

        s.inputDetails();
        s.displayDetails();
    }
}