import java.util.*;

class Q6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();

        int A[][] = new int[r][];

        // Input number of elements in each row
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

        // Display the jagged array
        System.out.println("Jagged Array:");

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < A[i].length; j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}