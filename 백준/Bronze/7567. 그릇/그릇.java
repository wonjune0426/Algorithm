import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력받은 그릇을 char 배열로 저장
        char[] bowls = br.readLine().toCharArray();
        br.close();

        // 그릇의 첫 방향 저장, 그릇의 모양이 바뀌면 저장
        char bowl = bowls[0];

        // 그릇의 높이를 구할 변수 초기 높이는 10이기 떄문에 10으로 초기화
        int sum = 10;

        // 첫번째 그릇을 제외한 나머지 그릇을 비교
        for (int i = 1; i < bowls.length; i++) {
            if (bowl == bowls[i]) {
                sum += 5;
            } else {
                bowl = bowls[i];
                sum += 10;
            }
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
