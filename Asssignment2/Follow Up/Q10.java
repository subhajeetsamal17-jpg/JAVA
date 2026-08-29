import java.util.*;

class Q10
{
    void display(String sic, String name, String branch,
                 int m1, int m2, int m3, int m4, int m5, int m6)
    {
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

        System.out.println("\nStudent Details");
        System.out.println("-------------------------");
        System.out.println("SIC       : " + sic);
        System.out.println("Name      : " + name);
        System.out.println("Branch    : " + branch);
        System.out.println("Total     : " + total);
        System.out.println("Average   : " + average);
        System.out.println("Grade     : " + grade);
    }

    public static void main(String args[])
    {
        if(args.length != 9)
        {
            System.out.println("Error: Please provide exactly 9 arguments.");
            System.out.println("Format: SIC Name Branch Mark1 Mark2 Mark3 Mark4 Mark5 Mark6");
            return;
        }

        String sic = args[0];
        String name = args[1];
        String branch = args[2];

        int m1 = Integer.parseInt(args[3]);
        int m2 = Integer.parseInt(args[4]);
        int m3 = Integer.parseInt(args[5]);
        int m4 = Integer.parseInt(args[6]);
        int m5 = Integer.parseInt(args[7]);
        int m6 = Integer.parseInt(args[8]);

        Q10 obj = new Q10();

        obj.display(sic, name, branch, m1, m2, m3, m4, m5, m6);
    }
}