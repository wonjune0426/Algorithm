import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        if (n % 2 == 0) bw.write("CY");
        else bw.write("SK");
        
        br.close();
        bw.flush();
        bw.close();
    }
}
