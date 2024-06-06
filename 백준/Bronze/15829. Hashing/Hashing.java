import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        char[] text = br.readLine().toCharArray();
        br.close();

        double sum = 0;

        for (int i = 0; i < text.length; i++) {
            int n = text[i] - 96;
            sum += n * Math.pow(31, i);
        }

        bw.write(String.valueOf((int)sum));
        bw.flush();
        bw.close();


    }
}
