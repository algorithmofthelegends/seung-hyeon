
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        /**
         *  n = 1~10000
         *  m = 1; // n으로 만들 수 있는 가짓수
         *
         *  String arr = 입력받은 배열
         *
         *  for(i=1; i<=n; i++)
         *  {
         *      m = m*i;
         *  }
         *
         *  for(i=1; m<i
         */
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[] arr = scan.nextLine().split(" ");
        String answer = "";


        for(int i=0; i<arr.length-1; i++)
        {
            if(Integer.parseInt(arr[i]) > Integer.parseInt(arr[i+1])) break;
            if(i+1 == arr.length-1)
            {
                for(int j=0; j<arr.length; j++)
                {
                    answer += arr[j];
                    if(j != arr.length-1) answer += " ";
                }
                System.out.println(answer);
                return;
            }
        }


        System.out.println("아녀");
    }
}

