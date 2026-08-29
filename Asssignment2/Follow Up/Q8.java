import java.util.*;

class Q8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        int A[][] = new int[r][c];
        int T[][] = new int[c][r];

        System.out.println("Enter the elements of the matrix:");

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }

        // Finding transpose
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                T[j][i] = A[i][j];
            }
        }

        System.out.println("Original Matrix:");

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Transpose of Matrix:");

        for(int i = 0; i < c; i++)
        {
            for(int j = 0; j < r; j++)
            {
                System.out.print(T[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}