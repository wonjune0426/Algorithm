import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());

            sum1 += n;

            if (sum1 == 100) break;

            if (sum1 > 100) {
                sum2 = sum1;
                sum1 -= n;
                break;
            }
        }


        if (sum2 == 0) bw.write(sum1 + " ");
        else if (100 - sum1 < sum2 - 100) bw.write(sum1 + "");
        else bw.write(sum2 + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
