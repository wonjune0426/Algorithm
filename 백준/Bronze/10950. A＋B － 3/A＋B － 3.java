import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int j = 0; j < N; j++) {
            String s = br.readLine();
            int A = Integer.parseInt(s.split(" ")[0]);
            int B = Integer.parseInt(s.split(" ")[1]);

            bw.write(A + B + "\n");
        }

        br.close();

        bw.flush();
        bw.close();

    }
}
