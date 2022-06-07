package bronze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class lsh_15649_java {

    static ArrayList<String> answerList = new ArrayList<>();

    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = 0;
        int p_index = -1;
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);

        out : for(int i=0; i<= 1000; i++)
        {
            for(int j=0; j<n-i; j++)
            {
                if(arr[j] > i) continue out;
            }
            p_index = i;
            break;
        }

        System.out.println(p_index);

        /*

            n , k , arr[], p_index
            if(n-k <= k)
            {
                for(int i=0; i<n-k; i++)
                {
                    if(arr[i] > k) return;
                }
                p_index = k;
            }

            ex)
            n = 5;
            8 4 5 3 10

            n-1

         */

    }
}