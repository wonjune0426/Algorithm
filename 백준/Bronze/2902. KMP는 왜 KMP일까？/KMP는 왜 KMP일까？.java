import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] names = br.readLine().split("-");
        br.close();
        
        for(String str : names){
            bw.write(str.substring(0,1));
        }
        bw.flush();
        bw.close();

    }
}