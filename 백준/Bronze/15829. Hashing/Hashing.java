import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        char[] text = br.readLine().toCharArray();
        br.close();

        long sum = 0L, pow = 1L;
        int m = 1234567891;

        // https://gliver.tistory.com/5

        for (int i = 0; i < text.length; i++) {
            int n = text[i] - 96;
            sum += (n * pow) % m;
            pow = 31 * pow % m;
        }

        bw.write(String.valueOf(sum%m));
        bw.flush();
        bw.close();


    }
}
