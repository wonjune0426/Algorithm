import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        br.close();
        
        int n1 = Integer.parseInt(s.split(" ")[0]);
        int n2 = Integer.parseInt(s.split(" ")[1]);
        int n3 = Integer.parseInt(s.split(" ")[2]);

        bw.write((n1 + n2) % n3 + "\n");
        bw.write(((n1 + n3) + (n2 + n3)) % n3 + "\n");
        bw.write(n1 * n2 % n3 + "\n");
        bw.write(((n1 % n3) * (n2 % n3)) % n3 + "\n");

        bw.flush();
        bw.close();
    }
}