import java.util.Scanner;

class Student {
    String sic;
    String name;
    int[] marks = new int[5];
    double average;

    // Constructor
    Student(String sic, String name, int[] marks) {
        this.sic = sic;
        this.name = name;

        for (int i = 0; i < 5; i++) {
            this.marks[i] = marks[i];
        }

        // Calculate average
        int total = 0;

        for (int i = 0; i < 5; i++) {
            total = total + marks[i];
        }

        average = (double) total / 5;
    }

    // Display student details
    void display() {
        System.out.println("SIC: " + sic);
        System.out.println("Name: " + name);
        System.out.println("Average Marks: " + average);
    }
}

// Driver class
public class Q12{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        // Input student details
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Enter SIC: ");
            String sic = sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            int[] marks = new int[5];

            System.out.println("Enter marks of 5 subjects:");

            for (int j = 0; j < 5; j++) {
                marks[j] = sc.nextInt();
            }

            sc.nextLine();

            students[i] = new Student(sic, name, marks);
        }

        // Find topper and lowest-average student
        int topper = 0;
        int lowest = 0;

        double totalAverage = 0;

        for (int i = 0; i < n; i++) {

            totalAverage = totalAverage + students[i].average;

            if (students[i].average > students[topper].average) {
                topper = i;
            }

            if (students[i].average < students[lowest].average) {
                lowest = i;
            }
        }

        // Calculate class average
        double classAverage = totalAverage / n;

        // Count students above class average
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (students[i].average > classAverage) {
                count++;
            }
        }

        // Display results
        System.out.println("\n===== TOPPER =====");
        students[topper].display();

        System.out.println("\n===== LOWEST AVERAGE =====");
        students[lowest].display();

        System.out.println("\n===== CLASS STATISTICS =====");
        System.out.println("Class Average: " + classAverage);
        System.out.println("Students above Class Average: " + count);
    }
}