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
        // 공등을 출력할 배열
        int[] arrN = new int[N];

        // 공을 넣는 힛수
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            int third = Integer.parseInt(st.nextToken());

            for (int j = first - 1; j <= second - 1; j++) {
                arrN[j] = third;
            }
        }

        for(int s : arrN){
            bw.write(s + " ");
        }
        bw.flush();
        bw.close();


    }
}
