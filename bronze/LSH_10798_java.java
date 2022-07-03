package bronze;

import java.util.Scanner;

public class LSH_10798_java {
    

    public class Main {
        public static void main(String[] args)
        {

            Scanner scan = new Scanner(System.in);

            /**
             *
             *  값은 a~z, A~z , 0~9
             *  행의 최대갯수는 15개
             *  행의 수는 5줄 일때
             *
             *  1열부터 5열까지 읽어낸다
             *
             *  5개의 행 생성
             *  1줄 입력 -> 1행 초기화
             *  5번반복

             *
             *  for( 15번 반복)
             *  {
             *      if( row[] 의 길이 >= i 이라면 값출력)
             *     1~5행을 돌면서 0번째 인덱스부터 출력
             *  }
             */

            String[] row1 = scan.nextLine().split("");
            String[] row2 = scan.nextLine().split("");
            String[] row3 = scan.nextLine().split("");
            String[] row4 = scan.nextLine().split("");
            String[] row5 = scan.nextLine().split("");


            for(int i=0; i<15; i++)
            {
                if(row1.length > i) System.out.printf(row1[i]);
                if(row2.length > i) System.out.printf(row2[i]);
                if(row3.length > i) System.out.printf(row3[i]);
                if(row4.length > i) System.out.printf(row4[i]);
                if(row5.length > i) System.out.printf(row5[i]);

            }

        }
    }


}
