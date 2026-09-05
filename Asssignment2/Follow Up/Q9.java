import java.util.*;

class Q9
{
    void display(int id, String name, int dept, double salary)
    {
        System.out.println("Employee ID = " + id);
        System.out.println("Employee Name = " + name);
        System.out.println("Department Number = " + dept);
        System.out.println("Salary = ₹" + salary);

        if(salary > 50000)
        {
            System.out.println("Salary is above ₹50,000");
        }
        else if(salary < 50000)
        {
            System.out.println("Salary is below ₹50,000");
        }
        else
        {
            System.out.println("Salary is equal to ₹50,000");
        }
    }

    public static void main(String args[])
    {
        if(args.length != 4)
        {
            System.out.println("Error: Please enter exactly 4 arguments.");
            return;
        }

        Scanner sc1 = new Scanner(args[0]);
        Scanner sc2 = new Scanner(args[2]);
        Scanner sc3 = new Scanner(args[3]);

        int id = sc1.nextInt();
        String name = args[1];
        int dept = sc2.nextInt();
        double salary = sc3.nextDouble();

        Q3 obj = new Q3();

        obj.display(id, name, dept, salary);
    }
}
