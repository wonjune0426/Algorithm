import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        // 문어의 마리 수
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N / 2; i++) {
            bw.write("1 2 ");
        }

        if (N % 2 != 0) bw.write("3");

        bw.flush();
        bw.close();
    }
}
