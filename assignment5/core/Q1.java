import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double mark1, mark2, mark3;

    Student(int rollNo, String name, double mark1, double mark2, double mark3) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    void display() {
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Name       : " + name);
        System.out.println("Marks      : " + mark1 + ", " + mark2 + ", " + mark3);
    }
}

class Result extends Student {
    double percentage;
    char grade;

    Result(int rollNo, String name, double mark1, double mark2, double mark3) {
        super(rollNo, name, mark1, mark2, mark3);
    }

    void calculateResult() {
        percentage = (mark1 + mark2 + mark3) / 3;

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 80)
            grade = 'B';
        else if (percentage >= 70)
            grade = 'C';
        else if (percentage >= 60)
            grade = 'D';
        else if (percentage >= 50)
            grade = 'E';
        else
            grade = 'F';
    }

    void displayResult() {
        super.display();
        System.out.println("Percentage : " + percentage);
        System.out.println("Grade      : " + grade);
        System.out.println();
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Result[] students = new Result[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("Roll No: ");
            int roll = sc.nextInt();

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Mark 1: ");
            double m1 = sc.nextDouble();

            System.out.print("Mark 2: ");
            double m2 = sc.nextDouble();

            System.out.print("Mark 3: ");
            double m3 = sc.nextDouble();

            students[i] = new Result(roll, name, m1, m2, m3);
            students[i].calculateResult();
        }

        System.out.println("\n--- STUDENT DETAILS ---");

        int highest = 0;

        for (int i = 0; i < n; i++) {
            students[i].displayResult();

            if (students[i].percentage > students[highest].percentage) {
                highest = i;
            }
        }

        System.out.println("--- STUDENT WITH HIGHEST PERCENTAGE ---");
        students[highest].displayResult();

        sc.close();
    }
}