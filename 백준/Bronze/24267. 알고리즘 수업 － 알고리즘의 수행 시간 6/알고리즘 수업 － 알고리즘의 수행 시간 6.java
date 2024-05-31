import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long s = Long.parseLong(br.readLine());
        br.close();

        bw.write(s*(s-1)*(s-2)/6+"\n");
        bw.write("3");
        bw.flush();
        bw.close();

    }
}
