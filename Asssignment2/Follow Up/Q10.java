import java.util.*;

class Q4
{
    public static void main(String args[])
    {
        if(args.length != 9)
        {
            System.out.println("Error: Please enter exactly 9 arguments.");
            return;
        }

        Scanner sc1 = new Scanner(args[0]);
        Scanner sc2 = new Scanner(args[3]);
        Scanner sc3 = new Scanner(args[4]);
        Scanner sc4 = new Scanner(args[5]);
        Scanner sc5 = new Scanner(args[6]);
        Scanner sc6 = new Scanner(args[7]);
        Scanner sc7 = new Scanner(args[8]);

        int sic = sc1.nextInt();
        String name = args[1];
        String branch = args[2];

        int m1 = sc2.nextInt();
        int m2 = sc3.nextInt();
        int m3 = sc4.nextInt();
        int m4 = sc5.nextInt();
        int m5 = sc6.nextInt();
        int m6 = sc7.nextInt();

        int total = m1 + m2 + m3 + m4 + m5 + m6;
        double average = total / 6.0;

        char grade;

        if(average > 90)
        {
            grade = 'O';
        }
        else if(average >= 80)
        {
            grade = 'E';
        }
        else if(average >= 70)
        {
            grade = 'A';
        }
        else if(average >= 60)
        {
            grade = 'B';
        }
        else if(average >= 50)
        {
            grade = 'C';
        }
        else
        {
            grade = 'F';
        }

        System.out.println("SIC = " + sic);
        System.out.println("Name = " + name);
        System.out.println("Branch = " + branch);
        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
        System.out.println("Grade = " + grade);
    }
}
