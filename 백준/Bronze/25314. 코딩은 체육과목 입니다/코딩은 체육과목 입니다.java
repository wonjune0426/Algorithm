import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer("int");
        for (int i = 1; i <= N / 4; i++) sb.insert(0, "long ");
        br.close();

        bw.write(sb.toString());

        bw.flush();
        bw.close();

    }
}
