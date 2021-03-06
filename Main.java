
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /**
         https://comain.tistory.com/191 복붙
         */

        String[] inputRowCol = scan.nextLine().split(" ");
        int row = Integer.parseInt( inputRowCol[0] );
        int col = Integer.parseInt( inputRowCol[1] );

        int count =0; //비어있는 라인
        String[] arr = new String[row];

        for(int i =0; i<row; i++)
        {
            arr[i] = scan.nextLine();
            if(arr[i].contains("X") == false)
            {
                count++;
            }
        }

        int max = count;
        count = 0;

        for(int i =0; i<col; i++)
        {
            int counts = 0;
            for(int j =0; j<row; j++)
            {
                if(arr[j].charAt(i) == '.')
                {
                    counts++;
                }
                if(counts == row) count++;
            }
        }

        max = Math.max(max,count);
        System.out.println(max);
    }

}

