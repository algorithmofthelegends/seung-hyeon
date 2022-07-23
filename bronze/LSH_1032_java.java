package bronze;

import java.util.Scanner;

public class LSH_1032_java {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /**
         input = 반복수
         문자열 a,b 2개생성
         a문자열에 첫번째 값저장
         if input == 1 return a문자열
         else
         for(i =o i<input-1 i++)
         b문자열 입력
         for(j =o j <input길이 j++)
         만약 a[j] 랑 b[j]가 다르다면 a[j]에 ? 입력
         return 반환
         */

        String[] a;
        String[] b;
        String answer = "";

        int input = Integer.parseInt( scan.nextLine() );
        a = scan.nextLine().split("");
        if( input == 1)
        {
            for(int i=0; i<a.length; i++)
            {
                answer += a[i];
            }
            System.out.println(answer);
            return;
        }

        for(int i=0; i<input-1; i++)
        {
            b = scan.nextLine().split("");
            for(int j=0; j<b.length; j++)
            {
                if(!(a[j].equals(b[j])))
                {
                    a[j] = "?";
                }
            }
        }

        for(int i=0; i<a.length; i++)
        {
            answer += a[i];
        }
        System.out.println(answer);
    }
}
