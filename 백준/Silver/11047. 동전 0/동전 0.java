import java.io.*;
import java.util.Arrays;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String str = br.readLine();

        // 동전의 가짓수
        int N = Integer.parseInt(str.split(" ")[0]);

        // 목표 금액
        int K = Integer.parseInt(str.split(" ")[1]);

        // 동전의 금액을 저장할 배열
        int[] arrN = new int[N];

        // 동전의 갯수 저장
        int count = 0;

        // 내림차순으로 배열에 저장
        for (int i = N - 1; i >= 0; i--) {
            arrN[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < N; i++) {
            if (arrN[i] <= K) {       // 동전이 목표 금액보다 작은 경우
                count += K/arrN[i];   // 목표금액 / 동전 만큼 갯수 추가
                K = K%arrN[i];        // 목표금액 % 동전 으로 목표금액 변경 
            }
        }


        bw.write(count + "\n");
        bw.flush();
        bw.close();

    }
}
