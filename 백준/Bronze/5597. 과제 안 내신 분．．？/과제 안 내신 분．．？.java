import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arrN = new int[30];
        for (int i = 0; i < arrN.length; i++) {
            arrN[i] = 0;
        }

        for (int i = 0; i < 28; i++) {
            int s = Integer.parseInt(br.readLine());
            arrN[s - 1] = s;
        }

        for (int i = 0; i < arrN.length; i++) {
            if (arrN[i] == 0) bw.write(i+1 + "\n");
        }

        bw.flush();
        bw.close();


    }
}
