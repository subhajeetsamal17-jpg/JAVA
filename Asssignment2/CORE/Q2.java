import java.util.*;

class Q2
{
    int SORT(int arr[], int n)
    {
        int i, j, temp;
        int count = 0;

        for(i = 0; i < n - 1; i++)
        {
            for(j = 0; j < n - 1 - i; j++)
            {
                count++;

                if(arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return count;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int N = sc.nextInt();

        int A[] = new int[N];

        System.out.println("Enter elements:");
        for(int i = 0; i < N; i++)
        {
            A[i] = sc.nextInt();
        }

        System.out.println("Array before sorting:");
        for(int i = 0; i < N; i++)
        {
            System.out.print(A[i] + " ");
        }

        System.out.println();

        Q2 obj = new Q2();

        int count = obj.SORT(A, N);

        System.out.println("Array after sorting:");
        for(int i = 0; i < N; i++)
        {
            System.out.print(A[i] + " ");
        }

        System.out.println();

        System.out.println("Total number of comparisons: " +count);

        System.out.println("Smallest element: " + A[0]);
        System.out.println("Largest element: " + A[N - 1]);

        sc.close();
    }
}