import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine(), ":");

        int count = 0;

        boolean flag = true;

        for (int i = 0; i < 3; i++) {
            int D = Integer.parseInt(st.nextToken());
            if (D != 00 && D <= 12) {
                count++;
            }
            if(D>=60) flag = false;
        }


        if (count == 0||!flag) bw.write("0");
        else bw.write((count * 2) + "");

        br.close();
        bw.flush();
        bw.close();

    }
}
