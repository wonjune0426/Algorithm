import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[42];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            int t = n % 42;
            arr[t]++;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) count++;
        }

        bw.write(count+"");

        bw.flush();
        bw.close();


    }
}
