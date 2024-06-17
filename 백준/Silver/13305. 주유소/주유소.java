import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main{
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        // 도시의 갯수
        int N = Integer.parseInt(br.readLine());

        // 도시간의 길어
        int[] distance = new int[N - 1];

        // 도시의 주요 요금
        int[] cost = new int[N];

        st = new StringTokenizer(br.readLine());

        // 길이를 입력 받음
        for (int i = 0; i < N - 1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        // 주유 요금을 입력 받음
        for (int i = 0; i < N; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }

        // 최소비용을 계산하기 위한 변수
        // 처음 도시 이동을 위해서는 처음 도시에서 주유 필요
        BigInteger sum = BigInteger.valueOf(((long) distance[0] * cost[0]));

        // 작은 주유값을 저장할 변수
        int minCost = cost[0];
        
        // 도시 -1 만큼 반복 (마지막 도시의 가격은 필요 없음)
        for (int i = 1; i < N - 1; i++) {
            // 제일 작은 주유 값 저장
            if (minCost > cost[i]) minCost = cost[i];
            sum = sum.add(BigInteger.valueOf((long) minCost *distance[i]));
        }

        bw.write(sum+"");
        bw.flush();
        bw.close();

    }
}
