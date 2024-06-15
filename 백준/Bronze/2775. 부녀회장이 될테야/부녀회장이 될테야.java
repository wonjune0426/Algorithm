import java.io.*;
import java.util.Arrays;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {


        // 거주민 수를 저장할 배열
        int[][] apt = new int[15][15];

        for (int i = 0; i < 15; i++) {
            apt[i][1] = 1;   // 각 층의 1호 거주민 수
            apt[0][i] = i;   // 0층의 거주민 수
        }


        for (int i = 1; i < 15; i++) {  // 각 층을 반복
            for (int j = 2; j < 15; j++) { // 호수를 반복 1호는 1이기 때문에 2부터
                // 현재 호의 거주민 =
                // 같은 층 앞에 호 거주민 + 밑에 층 깉은 호 거주민
                apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
            }
        }


        // 테스트 케이스
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int floor = Integer.parseInt(br.readLine());  // 층
            int number = Integer.parseInt(br.readLine()); // 호

            bw.write(apt[floor][number] + "\n");
        }

        br.close();

        bw.flush();
        bw.close();


    }
}
