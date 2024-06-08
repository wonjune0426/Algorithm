
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Integer[] scores = new Integer[N];

        int sumScore = 0;

        for (int i = 0; i < N; i++) {
            int run = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            run = Math.max(first, second);

            Integer[] arr = new Integer[5];
            for (int s = 0; s < arr.length; s++) {
                arr[s] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr, Collections.reverseOrder());

            sumScore = Math.max(sumScore, run + arr[0] + arr[1]);
        }

        bw.write(sumScore + "");
        bw.flush();
        bw.close();
    }
}
