import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 상근이가 가지고 있는 카드의 수
        int N = Integer.parseInt(br.readLine());

        // 카드를 1줄로 입력 받음
        st = new StringTokenizer(br.readLine());

        //  두 숫자 카드에 같은 수가 적혀있는 경우는 없다.
        //  Set에 저장
        Set<Integer> set = new HashSet<Integer>();

        // 상근이가 가지고 있는 카드들을 set에 담음
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        // 확인 할 카드의 수
        int M = Integer.parseInt(br.readLine());

        // 확인할 카드를 1줄로 입력 받음
        st = new StringTokenizer(br.readLine());

        // 확인할 카드 수 만큼 반복하여 set에 저장되어 있는지 확인
        for(int i = 0; i < M; i++){
            if(set.contains(Integer.parseInt(st.nextToken()))) bw.write(1 + " ");
            else bw.write(0 + " ");
        }

        br.close();

        bw.flush();
        bw.close();


    }
}
