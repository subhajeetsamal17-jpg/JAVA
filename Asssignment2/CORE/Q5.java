import java.util.*;

class Q5
{
    int GCD(int a, int b)
    {
        int iterations = 0;

        while(b != 0)
        {
            int rem = a % b;
            a = b;
            b = rem;
            iterations++;
        }

        System.out.println("Number of iterations: " + iterations);
        return a;
    }

    public static void main(String args[])
    {
        if(args.length != 2)
        {
            System.out.println("Error: Please provide exactly two integer arguments.");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        Q5 obj = new Q5();

        int gcd = obj.GCD(a, b);

        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("GCD: " + gcd);
    }
}