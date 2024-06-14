import java.io.*;

public class Main{
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int count = 0;

        int money = 1000 -n;


        count += money / 500;
        money = money % 500;

        count += money / 100;
        money = money % 100;

        count += money / 50;
        money = money % 50;

        count+= money / 10;
        money = money % 10;

        count += money / 5;
        money = money % 5;

        count += money;

        br.close();
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
