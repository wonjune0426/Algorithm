import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = N ; i > 0; i--) {
            for(int j = 1; j <= N; j++) {
                if(i <= j) bw.write("*");
                else bw.write(" ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
