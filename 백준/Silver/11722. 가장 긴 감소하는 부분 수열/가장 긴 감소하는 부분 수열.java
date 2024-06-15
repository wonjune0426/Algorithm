import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        // 수열의 크기
        int N = Integer.parseInt(br.readLine());

        int[] arrN = new int[N];
        int[] d = new int[N];

        st = new StringTokenizer(br.readLine());

        // 값들을 저장
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        d[0] = 1;
        for (int i = 1; i < N; i++) {
            d[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arrN[i] < arrN[j] && d[i] <= d[j]) {
                    d[i] = d[j] + 1;
                } else if (arrN[i] == arrN[j]) {
                    d[i] = d[j];
                }
            }
        }

        int max = 0;
        for(int i:d){
            max = Math.max(max,i);
        }


        bw.write(max + "");
        bw.flush();
        bw.close();


    }
}
