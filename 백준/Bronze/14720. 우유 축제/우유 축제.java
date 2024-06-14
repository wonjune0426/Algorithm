import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        // 우유 가게의 수
        int N = Integer.parseInt(br.readLine());

        // 마실 우유를 확인할 변수
        int milk = 0;

        // 우유를 마시는 횟수를 저장
        int count = 0;

        st = new StringTokenizer(br.readLine());

        // 가게 수 만큼 반복
        for(int i = 0; i < N; i++) {
            // 우유 마실 순서와 가게가 일치하면 ++
           if(milk == Integer.parseInt(st.nextToken())) {
               count++;
               if(milk == 2){  // 2일 경우 0으로 순서 변환
                   milk = 0;
               } else{
                   milk++;
               }
           }
        }

        br.close();

        bw.write(count + "\n");
        bw.flush();
        bw.close();


    }
}
