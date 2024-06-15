import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static int count;

    public static void main(String[] args) throws IOException {
        // Test Case
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            count = 0;
            findPlus(0,num);
            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static void findPlus(int value,int num) {
        if (value >= num) {
            return;
        }

        for (int i = 1; i <= 3; i++) {
            value += i;
            findPlus(value,num);
            if (value == num) count++;
            value -= i;
        }
    }
}
