import java.util.*;

class Q7
{
    void INSERT(int A[], int n, int element, int position)
    {
        for(int i = n; i >= position; i--)
        {
            A[i] = A[i - 1];
        }

        A[position - 1] = element;

        System.out.println("Array after insertion:");
        for(int i = 0; i <= n; i++)
        {
            System.out.print(A[i] + " ");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Extra space for the new element
        int A[] = new int[n + 1];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++)
        {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();

        System.out.print("Enter the position: ");
        int position = sc.nextInt();

        if(position < 1 || position > n + 1)
        {
            System.out.println("Invalid position");
        }
        else
        {
            Q7 obj = new Q7();
            obj.INSERT(A, n, element, position);
        }

        sc.close();
    }
}