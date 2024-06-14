import java.io.*;
import java.util.Arrays;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        // 학생의 수
        int N = Integer.parseInt(br.readLine());

        int[] scores = new int[N];

        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        long sum = 0;

        Arrays.sort(scores);

        for (int i = 0; i < N; i++) {
            sum += Math.abs(scores[i] -(i+1));
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
