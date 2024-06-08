import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 참여 인원을 입력 받음
        int N = Integer.parseInt(br.readLine());

        // 최종 점수를 저장할 변수
        int sumScore = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            // run 점수를 저장할 변수
            int run = 0;
            // 앞의 두개의 점수 중 큰 값을 저장
            run = Math.max(first, second);

            // trick 점수를 저장할 배열
            Integer[] arr = new Integer[5];

            // 반복문을 통해 하나씩 저장
            for (int s = 0; s < arr.length; s++) {
                arr[s] = Integer.parseInt(st.nextToken());
            }

            // 역순으로 정렬
            Arrays.sort(arr, Collections.reverseOrder());

            // run 점수와 제일 큰 점수 2개를 합한 것 중에 큰 것을 저장
            sumScore = Math.max(sumScore, run + arr[0] + arr[1]);
        }

        bw.write(sumScore + "");
        bw.flush();
        bw.close();
    }
}
