import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            int n = Integer.parseInt(s.split(" ")[0]);
            int m = Integer.parseInt(s.split(" ")[1]);
            bw.write("Case #" + (i + 1) + ": " + n + " + " + m + " = " + (n+m)+"\n");

        }
        br.close();

        bw.flush();
        bw.close();

    }
}
