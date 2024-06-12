import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        // 카드의 갯수
        int N = Integer.parseInt(st.nextToken());

        // 합을 구할 수
        int M = Integer.parseInt(st.nextToken());

        // 카드의 갯수만큼의 배열을 만듬
        int[] arrN = new int[N];

        st = new StringTokenizer(br.readLine());

        // 배열에 각 카드의 숫자를 저장
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
        bw.write(findSum(arrN, M) + "");
        bw.flush();
        bw.close();

    }

    // 최대 값을 찾는 메서드
    // 값을 전부 더한뒤 비교 값을 --하는 방식으로 구현 -> 시간 오래 걸림
    // 값을 더하면서 최대값을 구하기 위한 변수 사용으로 변경
    private static int findSum(int[] arrN, int M) {
        int N = arrN.length;

        int sum = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sumCase = arrN[i] + arrN[j] + arrN[k];
                    if (sumCase <= M && sum < sumCase) sum = sumCase;
                }
            }
        }
        return sum;
    }

}



