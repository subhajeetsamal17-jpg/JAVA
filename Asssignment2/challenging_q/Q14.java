import java.util.*;

class Q14
{
    void secondLargest(int A[], int n)
    {
        int largest = A[0];
        int second = Integer.MIN_VALUE;

        for(int i = 1; i < n; i++)
        {
            if(A[i] > largest)
            {
                second = largest;
                largest = A[i];
            }
            else if(A[i] > second && A[i] != largest)
            {
                second = A[i];
            }
        }

        if(second == Integer.MIN_VALUE)
        {
            System.out.println("Second largest distinct number does not exist.");
        }
        else
        {
            System.out.println("Second largest distinct number: " + second);
        }
    }

    public static void main(String args[])
    {
        if(args.length < 2)
        {
            System.out.println("Error: Please enter at least two integers.");
            return;
        }

        int n = args.length;
        int A[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            A[i] = Integer.parseInt(args[i]);
        }

        Q14 obj = new Q14();

        obj.secondLargest(A, n);
    }
}