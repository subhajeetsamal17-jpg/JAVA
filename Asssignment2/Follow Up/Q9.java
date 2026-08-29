import java.util.*;

class Q9
{
    void display(int id, String name, int dept, double salary)
    {
        System.out.println("\nEmployee Details");
        System.out.println("-------------------------");
        System.out.println("Employee ID       : " + id);
        System.out.println("Employee Name     : " + name);
        System.out.println("Department Number : " + dept);
        System.out.println("Salary            : ₹" + salary);

        if(salary > 50000)
        {
            System.out.println("Salary Status     : Above ₹50,000");
        }
        else if(salary < 50000)
        {
            System.out.println("Salary Status     : Below ₹50,000");
        }
        else
        {
            System.out.println("Salary Status     : Equal to ₹50,000");
        }
    }

    public static void main(String args[])
    {
        if(args.length != 4)
        {
            System.out.println("Error: Please provide exactly 4 arguments.");
            System.out.println("Format: Employee_ID Employee_Name Department_Number Salary");
            return;
        }

        int id = Integer.parseInt(args[0]);
        String name = args[1];
        int dept = Integer.parseInt(args[2]);
        double salary = Double.parseDouble(args[3]);

        Q9 obj = new Q9();

        obj.display(id, name, dept, salary);
    }
}