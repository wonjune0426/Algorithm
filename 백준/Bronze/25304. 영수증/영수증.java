import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int j = 0; j < N; j++) {
            String s = br.readLine();
            sum += Integer.parseInt(s.split(" ")[0])*
                    Integer.parseInt(s.split(" ")[1]);

        }

        if(X == sum) bw.write("Yes");
        else bw.write("No");

        br.close();

        bw.flush();
        bw.close();

    }
}
