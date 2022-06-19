package bronze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LSH_2775_java {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        // 0층 초기화한 배열생성 , 층수 배열, 동호수 배열생성
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14));
        ArrayList<Integer> floor = new ArrayList<>();
        ArrayList<Integer> apartNumber = new ArrayList<>();

        int T = Integer.parseInt(scan.nextLine());
        for(int i=0; i<T; i++)
        {
            floor.add(Integer.parseInt(scan.nextLine()));
            apartNumber.add(Integer.parseInt(scan.nextLine()));
        }

        // T층만큼 배열생성 
        for(int i=14; i<(T+1)*14; i++)
        {
            if(i%14 == 0)
            {
                arr.add(1);
            }
            else
            {
                arr.add(arr.get(i-1)+arr.get(i-14));
            }
        }

        // 동호수 인원수 출력
        for(int i=0; i<T; i++)
        {
            System.out.println(arr.get( (floor.get(i)*14 -1)  + apartNumber.get(i) ));
        }
    }
}
