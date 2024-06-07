import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 팔린 티켓팅 번호의 갯수
        int N = Integer.parseInt(br.readLine());
        // 티켓팅 번호의 숫자들 1줄로 입력 받음
        StringTokenizer st = new StringTokenizer(br.readLine());

        br.close();

        // 티켓팅 번호 중복 X, 정렬 필요 Treeset객체 생성
        // - 시간 초과 Treeset.contains 시간복잡도 O(log n)
        // Hashset으로 변경 contaions하면 정렬 필요 없음
        // HashSet. contains 시간 복잡도 O(1)
         Set<Integer> arrayList = new HashSet<>();

        // 각각의 번호들을 set에 담음
        for (int i = 0; i < N; i++) {
            arrayList.add(Integer.valueOf(st.nextToken()));
        }


        // 티켓팅 번호
        int ticketNum = 1;

        // 최소 번호를 찾기 위한 반복
        while(true){
            // 티켓팅 번호가 이미 있다면 1증가
            if(arrayList.contains(ticketNum)) ticketNum++;
            // 없다면 탈출
            else break;
        }

        // 티켓팅 번호 출력
        bw.write(ticketNum + "\n");
        bw.flush();
        br.close();
    }
}
