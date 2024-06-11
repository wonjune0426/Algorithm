import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] chars = br.readLine().toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            sum+=Integer.parseInt(String.valueOf(chars[i]));
        }
        System.out.println(sum);


    }
}
