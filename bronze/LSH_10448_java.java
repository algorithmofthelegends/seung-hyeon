package bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LSH_10448_java {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        /**
         *  Tn = n(n+1)/2 라는 공식을 삼각수라한다
         *  어떤 자연수가 입력받았을때 이자연수는 3개의 Tn으로 표시될 수 있나? 를 묻는거고
         *  맞다면 1 틀리다면 0이다
         *
         *  입력은 3~1000이다
         *
         *  1) int input = scan
         *  2) Tn으로 만들 수있는 (1000이하의) 값들모두 생성
         *  3) 1,1,1 -> 1,1,2 -> 1,1,3 방식으로 모든 조합 다 계산해보기 (무식해보지만 컴퓨터를 믿자!)
         *
         */
        List<Integer> tnList = new ArrayList<>();
        int i = 1;
        while(true)
        {
            int output = tn(i);
            if(output > 1000)
            {
                break;
            }else
            {
                tnList.add(output);
                i++;
            }
        }

        int iterator = scan.nextInt();


        for(int start =0; start<iterator; start++)
        {
            int check = 0;
            int answer = 0;
            int input = scan.nextInt();
            end:for(int j=0; j<44; j++)
            {
                check += tnList.get(j);
                for(int k=0; k<44; k++)
                {
                    check += tnList.get(k);
                    for(int l=0; l<44; l++)
                    {
                        check += tnList.get(l);
                        if(input == check)
                        {
                            answer = 1;
                            break end;
                        }
                        check -= tnList.get(l);
                    }
                    check -= tnList.get(k);

                }
                check -= tnList.get(j);
            }
            System.out.println(answer);
        }


    }

    public static int tn(int n){
        return (n*(n+1))/2;
    }
}
