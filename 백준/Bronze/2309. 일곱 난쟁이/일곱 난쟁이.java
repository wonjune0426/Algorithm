import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // 정답 7명을 찾는 방법으로 시도 -> 코드 길이 길어짐 비 효율적
        // 풀이 참고 -> 2명을 제거하는 방식으로 변경
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 9명의 키를 담을 배열
        int[] N = new int[9];

        // 키를 더해 저장할 변수
        int sum = 0;

        // 키를 입력 받고 키의 전부를 더함
        for (int i = 0; i < N.length; i++) {
            N[i] = Integer.parseInt(br.readLine());
            sum += N[i];
        }

        // 입력받은 키를 정렬
        Arrays.sort(N);

        // 출력 시 제거할 키의 인덱스
        int x1 = 0, x2 = 0;

        // 2명을 제거 하기 위한 반복문
        for (int i = 0; i < N.length - 1; i++) {
            for (int j = i + 1; j < N.length; j++) {
                if (sum - N[i] - N[j] == 100) {
                    x1 = i;
                    x2 = j;
                }
            }
        }

        // 답 출력
        for (int i = 0; i < N.length; i++) {
            if (i != x1 && i != x2) bw.write(N[i] + "\n");
        }


        bw.flush();
        bw.close();


    }
}
