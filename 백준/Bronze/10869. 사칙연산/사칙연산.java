import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputString = br.readLine();
        br.close();

        int n = Integer.parseInt(inputString.split(" ")[0]);
        int m = Integer.parseInt(inputString.split(" ")[1]);

       bw.write((n+m)+"\n");
       bw.write((n-m)+"\n");
       bw.write((n*m)+"\n");
       bw.write((n/m)+"\n");
       bw.write((n%m)+"\n");
       bw.flush();
       bw.close();
    }
}