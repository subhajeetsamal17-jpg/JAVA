import java.util.Scanner;

class Student {
    int regNo;
    String stdName;
    String branch;
    double CGPA;

    
    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Registration Number: ");
        regNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        stdName = sc.nextLine();

        System.out.print("Enter Branch: ");
        branch = sc.nextLine();

        System.out.print("Enter CGPA: ");
        CGPA = sc.nextDouble();
    }


    void display() {
        System.out.println("Registration Number: " + regNo);
        System.out.println("Student Name: " + stdName);
        System.out.println("Branch: " + branch);
        System.out.println("CGPA: " + CGPA);
    }
}


public class Q3{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Student[] students = new Student[5];

        
        for (int i = 0; i < 5; i++) {
            students[i] = new Student();

            System.out.println("\nEnter details of Student " + (i + 1));
            students[i].accept();
        }

        
        int highest = 0;

        for (int i = 1; i < 5; i++) {
            if (students[i].CGPA > students[highest].CGPA) {
                highest = i;
            }
        }

        
        System.out.println("\n===== STUDENT WITH HIGHEST CGPA =====");
        students[highest].display();
    }
}