import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());

        if (A >= 90) bw.write("A");
        else if (A >= 80) bw.write("B");
        else if (A >= 70) bw.write("C");
        else if (A >= 60) bw.write("D");
        else bw.write("F");
        
        bw.flush();
        bw.close();
    }
}