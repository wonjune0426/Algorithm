import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 바구니의 갯수
        int N = Integer.parseInt(st.nextToken());
        // 바구니에 담긴 공을 저장할 배열
        int[] arrN = new int[N];

        // 바구니에 공 초기화
        for (int i = 0; i < N; i++) {
            arrN[i] = i + 1;
        }

        // 공을 바꿀 횟수
        int M = Integer.parseInt(st.nextToken());

        // 공을 바꾸기위한 변수
        int save = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken()) - 1;
            int second = Integer.parseInt(st.nextToken()) - 1;

            save = arrN[first];
            arrN[first] = arrN[second];
            arrN[second] = save;
        }


        for (int s : arrN) {
            bw.write(s + " ");
        }

        bw.flush();
        bw.close();


    }
}
