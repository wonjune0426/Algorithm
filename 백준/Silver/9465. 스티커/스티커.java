import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        // 테스트 케이스
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            // 스티커의 갯수
            int n = Integer.parseInt(br.readLine());

            // 스티커의 값들을 저장할 배열
            int[][] sticker = new int[2][n];

            // 스티커 값을 입력 받은 뒤 저장
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                sticker[0][j] = Integer.parseInt(st1.nextToken());
                sticker[1][j] = Integer.parseInt(st2.nextToken());
            }


            // 최대값을 구할 dp배열
            int[][] dp = new int[2][n];

            // 첫 번째 자리값 초기화
            dp[0][0] = sticker[0][0];
            dp[1][0] = sticker[1][0];


            // 최대 값을 저장할 변수
            int max = 0;

            // 대각선의 위치의 값과 현재 위치 값을 더함 (대각선의 값과 대각선 값의 하나 전의 값을 비교 하여 큰값)
            for (int z = 1; z < n; z++) {
                if(z == 1){
                    dp[0][z] = dp[1][0] + sticker[0][1];
                    dp[1][z] = dp[0][0] + sticker[1][1];
                    continue;
                }
                dp[0][z] = Math.max(dp[1][z - 1], dp[1][z - 2]) + sticker[0][z];
                dp[1][z] = Math.max(dp[0][z - 1], dp[0][z - 2]) + sticker[1][z];
            }

                max = Math.max(max, Math.max(dp[0][n-1], dp[1][n-1]));

            bw.write(max + "\n");

        }

        bw.flush();
        bw.close();

    }
}
