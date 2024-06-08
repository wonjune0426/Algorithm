
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            int t = Integer.parseInt(br.readLine());
            if (t > max) {
                max = t;
                index = i+1;
            }
        }

        br.close();

        bw.write(max+"\n"+index);
        bw.flush();
        bw.close();
    }
}
