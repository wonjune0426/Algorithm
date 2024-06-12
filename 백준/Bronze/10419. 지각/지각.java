import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        // 경우의 수
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());

            // 최대시간 비교 변수
            int max = 0;

            for (int i = 0; i < n; i++) {
                if (i + (i * i) <= n) {
                    max = Math.max(max, i);
                } else break;
            }
            bw.write(max+"\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
