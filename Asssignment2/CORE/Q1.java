import java.util.*;
class Q1
{
	int SEARCH(int arr[],int key,int n)
	{
		int i;
		int pos=-1;
		for(i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				pos=i;
				break;
			}
		}
		if(pos!=-1)
		{
			return pos+1;
		}
		else
		{
			return -1;
		}
	}
	
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array ");
        int N = sc.nextInt();

        int A[] = new int[N];

        System.out.println("Enter " + N + " elements:");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int E = sc.nextInt();
		Q1 obj = new Q1();

      

        int position = obj.SEARCH(A, E, N);

        if (position != -1) {
            System.out.println("Element found at position: " + position);
        } else {
            System.out.println("Element Not Found");
        }

        sc.close();
    }
}
		

			