import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        // 활잡이의 수
        int N = Integer.parseInt(br.readLine());

        int[] arrN = new int[N];

        st = new StringTokenizer(br.readLine());

        // 활잡이의 봉우리 저장
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        // 최대값 구할 변수
        int max = 0;

        for (int i = 0; i < N; i++) {
            int count =0;
            for (int j = i + 1; j < N; j++) {
                if (arrN[i] < arrN[j]) break;
                else count++;
            }

            max = Math.max(max, count);
        }

        bw.write(max + "\n");
        bw.flush();
        bw.close();

    }
}
