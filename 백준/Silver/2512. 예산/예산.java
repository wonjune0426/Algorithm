import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        // 요청 예산의 수
        int N = Integer.parseInt(br.readLine());

        // 요청 예산을 저장할 배열
        int[] arrN = new int[N];

        st = new StringTokenizer(br.readLine());

        int min = 1;
        int max = 0;

        long sum = 0;

        // 요청 예산을 각각 저장
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arrN[i]);
            sum += arrN[i];
        }

        // 현재 가지고 있는 예산
        int M = Integer.parseInt(br.readLine());

        if (M >= sum) {
            bw.write(String.valueOf(max));
        } else {
            int mid = 0;
            while (min <= max) {
                sum = 0;
                mid = (max + min) / 2;

                for (int i = 0; i < N; i++) {
                    if (arrN[i] < mid) sum += arrN[i];
                    else sum += mid;
                }

                if (sum <= M) min = mid + 1;
                else max = mid - 1;
            }
            bw.write(String.valueOf(max));
        }


        bw.flush();
        bw.close();

    }


}
