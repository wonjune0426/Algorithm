import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        BigInteger K = new BigInteger(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int y = 0;

        for (int i = 2; i < L; i++) {
            if (K.remainder(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO) == 0) {
                y = i;
                break;
            }
        }

        if (y > 0) {
            bw.write("BAD " + y);
        } else {
            bw.write("GOOD");
        }


        bw.flush();
        bw.close();

    }
}
