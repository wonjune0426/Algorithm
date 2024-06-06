import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int j = 1; j <= N; j++) {
            sum += j;
        }

        bw.write(String.valueOf(sum));
        br.close();

        bw.flush();
        bw.close();

    }
}