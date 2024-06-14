import java.io.*;
import java.util.Arrays;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        // 학생의 수
        int N = Integer.parseInt(br.readLine());

        // 점수들을 저장할 배열
        int[] scores = new int[N];

        // 각 점수를 입력 받음
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        // 불만도의 합을 구할 변수
        long sum = 0;

        // 오름 차순 정렬 후 등수를 매기는 것이 제일 불만도가 적음
        Arrays.sort(scores);

        // 각각의 불만도를 더함
        for (int i = 0; i < N; i++) {
            sum += Math.abs(scores[i] -(i+1));
        }
        
        // 출력 때문에 2번 틀림..
//        bw.write(sum+"\n");
//        bw.write(sum+"");
        
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
