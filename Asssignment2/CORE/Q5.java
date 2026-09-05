import java.util.*;

class Q5
{
    public static void main(String args[])
    {
        if(args.length != 2)
        {
            System.out.println("Error: Please enter exactly two integer numbers.");
            return;
        }

        Scanner sc1 = new Scanner(args[0]);
        Scanner sc2 = new Scanner(args[1]);

        int num1 = sc1.nextInt();
        int num2 = sc2.nextInt();

        int a = num1;
        int b = num2;
        int iterations = 0;

        while(b != 0)
        {
            int rem = a % b;
            a = b;
            b = rem;
            iterations++;
        }

        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);
        System.out.println("GCD = " + a);
        System.out.println("Number of iterations = " + iterations);
    }
}
