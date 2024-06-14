import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // 지불한 돈
        int n = Integer.parseInt(br.readLine());

        // 거스름돈의 갯수
        int count = 0;

        // 거스름돈 계산
        int money = 1000 - n;

        // 거스름돈의 종류
        int[] coins = new int[]{500, 100, 50, 10, 5, 1};

        // 거스름돈의 갯수 계산
        for (int i = 0; i < coins.length; i++) {
            count += money / coins[i];
            money = money % coins[i];

            if (money == 0) break; // 거스름돈을 계산한 금액이 0이면 탈출
        }


        br.close();
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
