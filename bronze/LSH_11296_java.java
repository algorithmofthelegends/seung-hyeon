package bronze;

import java.util.Scanner;

public class LSH_11296_java {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        // 가격,할인률,쿠폰유무,카드결제유무

        /**
         * 입력값 -> N(숫자)
         *
         * 가격 -> 00.00
         * 할인률 -> R-빨강(45), G-초록(30), B-파란(20), Y-노랑(15), O-주황(10), W-흰(5)
         *
         * 쿠폰 유무 -> C -> 있음, X-> 없음 있다면 할인된 가격에서 5프로 추가 할인 ( 소수점3째자리에서 반올림)
         *
         * 결제방식 -> C->현금 , P->카드 , 현금결제라면 소수점 2번째자리에서 반올림
         */

        /**
         *  n (반복할 횟수)
         *  a(금액),b(할인률),c(추가할인여부),d(최종할인 금액에대한 결제수단)
         *
         *  n개크기의 String배열생성
         *
         *  for(n번만큼반복)
         *  a,b,c,d 입력받기
         *
         *  for( n번 반복한다 )
         *  1) first = a-(a*(b/100))  -> 할인된 금액을 구하자
         *  2) if( c가 C라면 ) second = first-(first*(5/100)) (3째자리 반올림)
         *     else if(c가 X라면) second = first( 3쨰자리 반올림)
         *  3) if(d가 C라면) third = second (2쨰리 반올림)
         *     else(d가 P라면) third = second
         *
         */

        int n = Integer.parseInt(scan.nextLine());
        String[] inputList = new String[n];
        for(int i=0; i<n; i++)
        {
            inputList[i] = scan.nextLine();
        }

        float a = 0;
        float b = 0;
        String c = "";
        String d = "";

        for(int i=0; i<n; i++)
        {
            a = Float.valueOf( inputList[i].split(" ")[0] );
            //b =
            if(inputList[i].split(" ")[1].equals("R")) b = (float) 0.45;
            if(inputList[i].split(" ")[1].equals("G")) b = (float) 0.30;
            if(inputList[i].split(" ")[1].equals("B")) b = (float) 0.20;
            if(inputList[i].split(" ")[1].equals("Y")) b = (float) 0.15;
            if(inputList[i].split(" ")[1].equals("O")) b = (float) 0.10;
            if(inputList[i].split(" ")[1].equals("W")) b = (float) 0.05;
            //
            c = inputList[i].split(" ")[2];
            d = inputList[i].split(" ")[3];

            ////

            // 색상 할인
            a = a-(a*b);

            //쿠폰 할인
            if(c.equals("C")) a = a-(a*(float)(0.05));
            a = Float.valueOf(String.format("%.2f",a));

            //최종 결제가격
            if (d.equals("C")) System.out.println("$"+String.format("%.1f"+"0",a));
            else System.out.println("$"+String.format("%.2f",a));

        }
    }
}