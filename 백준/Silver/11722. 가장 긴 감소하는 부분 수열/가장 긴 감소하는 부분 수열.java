import java.io.*;
import java.util.StringTokenizer;

public class Main{
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        // 수열의 크기
        int N = Integer.parseInt(br.readLine());

        int[] arrN = new int[N];
        // 수열의 길이를 저장할 배열
        int[] d = new int[N];

        st = new StringTokenizer(br.readLine());

        // 값들을 저장
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        // 초기값 1로 지정
        d[0] = 1;

        // 수열 index 1번부터 반복
        for (int i = 1; i < N; i++) {
            d[i] = 1; // 각 수열의 길이 1로 지정
            for (int j = 0; j < i; j++) { // 해당 번호의 index까지 반복
                // arrN[i] < arrN[j] -- 감소하는 수열
                // d[i]의 값을 1증가
                if (arrN[i] < arrN[j] && d[i] <= d[j]) {
                    d[i] = d[j] + 1;
                } else if (arrN[i] == arrN[j]) { // 값이 같다면 같은 길이
                    d[i] = d[j];
                }
            }
        }

        int max = 0;
        
        // 길이 배열의 값 중 max값 추출
        for(int i:d){  
            max = Math.max(max,i);
        }


        bw.write(max + "");
        bw.flush();
        bw.close();


    }
}
