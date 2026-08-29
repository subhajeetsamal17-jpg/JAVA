import java.util.*;

class Q3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        int A[][] = new int[r][c];
        int B[][] = new int[r][c];
        int C[][] = new int[r][c];

        System.out.println("Enter elements of first matrix:");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                B[i][j] = sc.nextInt();
            }
        }

        // Matrix Addition
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("First Matrix:");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Second Matrix:");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Resultant Matrix after Addition:");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}