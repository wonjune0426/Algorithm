import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int A = Integer.parseInt(s.split(" ")[0]);
        int B = Integer.parseInt(s.split(" ")[1]);

        br.close();

        if (A < B) bw.write("<");
        else if (A > B) bw.write(">");
        else bw.write("==");

        bw.flush();
        bw.close();
    }
}