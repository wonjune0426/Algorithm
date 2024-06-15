import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static final int[] arr = new int[]{1, 2, 3};

    private static int count;

    private static int num;

    public static void main(String[] args) throws IOException {
        // Test Case
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(br.readLine());
            count = 0;
            find(0);
            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static void find(int value) {
        if (value >= num) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            value += arr[i];
            find(value);
            if(value == num) count++;
            value -= arr[i];
        }
    }
}
