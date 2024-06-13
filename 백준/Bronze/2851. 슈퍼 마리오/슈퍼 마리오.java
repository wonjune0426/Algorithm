import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int sum1 = 0; // 100보다 작거나 같은 값을 더한 변수
        int sum2 = 0; // 100보다 큰 값을 더할 변수 

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());

            sum1 += n;
            
            // 더한 값이 100일 경우 반복문 탈출
            if (sum1 == 100) break;

            // 더한 값이 100이 넘어가는 시점에 
            // sum2에 값을 더하고 
            // sum1에 n을 빼준 뒤 반복문 탈출
            if (sum1 > 100) {
                sum2 = sum1;
                sum1 -= n;
                break;
            }
        }

        
        if (sum2 == 0) bw.write(sum1 + " ");    // sum2가 0인경우 합이 100보다 작거나 같음
        else if (100 - sum1 < sum2 - 100) bw.write(sum1 + ""); // 두개의 값을 비교해 차이가 작은 값 출력
        else bw.write(sum2 + "");

        br.close();
        bw.flush();
        bw.close();
    }
}
