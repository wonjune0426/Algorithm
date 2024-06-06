import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            int sum = Integer.parseInt(s.split(" ")[0]) + Integer.parseInt(s.split(" ")[1]);
            bw.write("Case #" + (i+1) + ": " + sum + "\n");

        }
        br.close();

        bw.flush();
        bw.close();

    }
}
