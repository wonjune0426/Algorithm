import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Integer[] scores = new Integer[N];

        int max;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            if (first > second) max = first;
            else if (first < second) max = second;
            else max = first;

            Integer[] arr = new Integer[5];
            for (int s = 0; s < arr.length; s++) {
                arr[s] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr, Collections.reverseOrder());

            scores[i] = max + arr[0] + arr[1];
        }

        Arrays.sort(scores, Collections.reverseOrder());

        bw.write(scores[0]+"");
        bw.flush();
        bw.close();
    }
}
