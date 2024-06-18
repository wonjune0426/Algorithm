import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        // 센서의 갯수
        int N = Integer.parseInt(br.readLine());

        // 센서의 위치를 저장할 배열
        int[] arrN = new int[N];

        // 센서간의 차이를 저장할 배열
        int[] difN = new int[N - 1];


        // 집중국의 갯수
        int K = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        // 센서의 위치를 저장
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        // 최소 차이를 구하기 위한 오름차순 정렬
        Arrays.sort(arrN);

        // 센서간의 위치 차이 저장
        for (int i = 0; i < N - 1; i++) {
            difN[i] = arrN[i+1] - arrN[i];
        }


        // 센서간의 차이를 오름차순으로 정렬
        Arrays.sort(difN);

        // 최소 합을 구할 범위 (차이를 구한 배열레서 길이가 먼 곳을 k-1개만큼 제외할 수 있음)
        int range = difN.length - (K-1);

        // 최소 합을 구할 변수
        int sum =0;

        // 차이를 구한 배열에서 하나씩 더함
        for(int i=0;i<range;i++){
            sum+=difN[i];
        }


        bw.write(sum + "");
        bw.flush();
        bw.close();

    }
}
