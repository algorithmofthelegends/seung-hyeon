package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lsh_15649_java {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 얻어낸 규칙
        // 모수는 3-N<= x <= 2+2N 이다.
        // 각 인원이 가질 수 있는 모수는 2개이하의 최소값, N개이상의 최대값 그리고 3~(N+2)개만큼의 값 이렇데 3가지이다
        // N이 1일경우를 제외한후 K값에 맞춰 출력할 값을 설정한다.

        // N-총인원수 , M-현재 모수를 외치는 번호 , K- 다음 차례가 될사람을 지정할 모수의 갯수
        String input = br.readLine();
        String[] inputList = input.split(" ");

        int N = Integer.parseInt(inputList[0]);
        int M = Integer.parseInt(inputList[1]); // M이 2라면 반시계방향으로 1만큼 이동한거기 때문에 M-1로 받아야계산이 편했음
        int K = Integer.parseInt(inputList[2]);
        int answer = 0;
/*
        if(N==1) answer = 1;// N이 1일경우
        else if( K<=2 ) answer = K-2+N+M; // K가 3이하
        else if( 2<K && K<=(N+2) ) answer = K-2+M; // K가 3~(N+2) 사이
        else if( (N+2)<K ) answer = K-N-2+M; // K가 N+2초과 일경우

        // M만큼 번호를 이동시키고 answer의 값이 전체 인원을 넣는다면 한바퀴를 돈것이므로 전체인원을 빼준후 출력한다
        if(answer > N) answer = answer-N;

 */
        answer = M+K-3; // K모를 외치는건 M번째가 가질 수 있는 K모의 최대,순번+3,최소 모랑 같고 계산을 편하게 하기위해 -3처리
        answer = answer%N; // 최대인경우를 생각해서 인원수의 나머지로 기존 순번으로 초기화하기
        if(answer <= 0) answer = answer+N; // 0이나 음수일경우 전체인원수를 더해줌으로서 기존 순번으로 초기화하기
        System.out.println(answer);

    }
}
