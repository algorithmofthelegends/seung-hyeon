package bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class LSH_11285_java
{
    public static void main(String[] args) {

        //유니코드 U+AC00..U+D7A3 초중성으로 이루어진 1117글자자
        Scanner scan = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        // 한글 전산화 역사 -> https://m.blog.naver.com/with_msip/222009981690
        // 초성,중성,종성 합쳐셔 유니코드 만드는 공식  //https://needjarvis.tistory.com/644
        // 초,중,종성담긴 3개배열 준비
        // (초성인덱스 * 21 + 중성인덱스) * 28 + 종성인덱스

        //배열3개
        String[] choSung = {"ㄱ","ㄲ","ㄴ","ㄷ","ㄸ","ㄹ","ㅁ","ㅂ","ㅃ",
                "ㅅ","ㅆ","ㅇ","ㅈ","ㅉ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ"};

        String[] joongSung = {"ㅏ","ㅐ","ㅑ","ㅒ","ㅓ","ㅔ","ㅕ","ㅖ","ㅗ","ㅘ",
                "ㅙ","ㅚ","ㅛ","ㅜ","ㅝ","ㅞ","ㅟ","ㅠ","ㅡ","ㅢ","ㅣ"};

        String[] jongSung = {"","ㄱ","ㄲ","ㄳ","ㄴ","ㄵ","ㄶ","ㄷ","ㄹ","ㄺ","ㄻ","ㄼ",
                "ㄽ","ㄾ","ㄿ","ㅀ","ㅁ","ㅂ","ㅄ","ㅅ","ㅆ","ㅇ","ㅈ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ"};

        //종성 들어온지 안들어온지 확인
        int jongSungCheck = 0;

        while (scan.hasNextLine())
        {
            arrayList.add(scan.nextLine());
            jongSungCheck++;
        }


        int cho = 0; // 입력받은 초성인덱스
        int joong = 0; // 입력받은 중성인덱스
        int jong = 0; // 입력받은 종성인덱스

        //초성 인덱스 설정
        for(int i=0; i<choSung.length; i++)
        {
            if(choSung[i].equals(arrayList.get(0)))
            {
                cho = i;
            }
        }

        //중성인덱스 설정
        for(int i=0; i<joongSung.length; i++)
        {
            if(joongSung[i].equals(arrayList.get(1)))
            {
                joong = i;
            }
        }

        //종성 입력받았다면 -> 종성 인덱스 설정
        if(jongSungCheck == 3)
        {
            for (int i = 0; i < jongSung.length; i++)
            {
                if (jongSung[i].equals(arrayList.get(2)))
                {
                    jong = i;
                }
            }
        }

        // 유니코드 완성형한자 변환공식으로 문자 조합
        char answer = (char) ((cho * 21 + joong) *28 + jong + 0xAC00);
        System.out.println(answer);
    }
}
