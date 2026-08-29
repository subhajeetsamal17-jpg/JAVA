import java.util.*;

class Q13
{
    void findFrequency(int A[], int n, int Q, Scanner sc)
    {
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

        
        for(int i = 0; i < n; i++)
        {
            if(freq.containsKey(A[i]))
            {
                freq.put(A[i], freq.get(A[i]) + 1);
            }
            else
            {
                freq.put(A[i], 1);
            }
        }

    
        for(int i = 0; i < Q; i++)
        {
            int key = sc.nextInt();

            if(freq.containsKey(key))
            {
                System.out.println(freq.get(key));
            }
            else
            {
                System.out.println(0);
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int A[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            A[i] = sc.nextInt();
        }

        int Q = sc.nextInt();

        Q13 obj = new Q13();

        obj.findFrequency(A, n, Q, sc);

        sc.close();
    }
}