import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        br.close();
        long s1 = Long.parseLong(s.split(" ")[0]);
        long s2 = Long.parseLong(s.split(" ")[1]);
        long s3 = Long.parseLong(s.split(" ")[2]);

        bw.write(String.valueOf(s1+s2+s3));

        bw.flush();
        bw.close();
    }
}