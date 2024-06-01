import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        br.close();

        for(int i = 0; i < s.length()/10; i++) {
            bw.write(s.substring(10*i,10*(1+i))+"\n");
        }
        bw.write(s.substring(s.length()/10*10));

        bw.flush();
        bw.close();
    }
}