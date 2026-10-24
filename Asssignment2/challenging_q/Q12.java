import java.util.*;

class Q12
{
    void rotateLeft(int A[], int n, int d)
    {
        for(int k = 1; k <= d; k++)
        {
            int first = A[0];

            for(int i = 0; i < n - 1; i++)
            {
                A[i] = A[i + 1];
            }

            A[n - 1] = first;

            System.out.print("Rotation " + k + ": ");
            for(int i = 0; i < n; i++)
            {
                System.out.print(A[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int A[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++)
        {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter the number of positions to rotate: ");
        int d = sc.nextInt();

        d = d % n;

        Q12 obj = new Q12();

        obj.rotateLeft(A, n, d);

        System.out.print("Output: [");
        for(int i = 0; i < n; i++)
        {
            System.out.print(A[i]);

            if(i < n - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        sc.close();
    }
}