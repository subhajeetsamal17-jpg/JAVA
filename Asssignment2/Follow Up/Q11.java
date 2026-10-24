import java.util.*;

class Q11
{
    void findMinMax(int A[][])
    {
        int smallest = A[0][0];
        int largest = A[0][0];

        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[i].length; j++)
            {
                if(A[i][j] < smallest)
                {
                    smallest = A[i][j];
                }

                if(A[i][j] > largest)
                {
                    largest = A[i][j];
                }
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();

        int A[][] = new int[r][];

        for(int i = 0; i < r; i++)
        {
            System.out.print("Enter the number of elements in row " + (i + 1) + ": ");
            int c = sc.nextInt();

            A[i] = new int[c];

            System.out.println("Enter " + c + " elements:");
            for(int j = 0; j < c; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nJagged Array:");

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < A[i].length; j++)
            {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        Q11 obj = new Q11();

        obj.findMinMax(A);

        sc.close();
    }
}