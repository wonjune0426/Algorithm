import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // case의 갯수
        int caseCount = Integer.parseInt(br.readLine());

        // 문서의 중요도에 따라 순서를 변경할 queue
        Queue<int[]> queue;


        // case 갯수만큼 반복
        for (int i = 0; i < caseCount; i++) {
            String s = br.readLine(); // 문서의 수와 확인할 문서 index 입력받음

            int N = Integer.parseInt(s.split(" ")[0]); // 문서의 수
            int M = Integer.parseInt(s.split(" ")[1]); // 확인하고자 하는 문서 index

            queue = new LinkedList<>();

            String[] documents = br.readLine().split(" "); // 문서들의 중요도

            // 초기 위치와 중요도 queue에 담음
            for(int j = 0; j < N; j++) {
                queue.offer(new int[]{j, Integer.parseInt(documents[j])});
            }

            // 출력 순서 반환 변수
            int count =0;

            // 문서의 출력 번호를 확인하기 위한 반복문
            while(true){
                int[] document = queue.poll(); // 첫 문서 정보를 poll

                // 제일 앞의 문서보다 중요도가 높은 문서가 있는 지 확인하는 flag
                // true -> 중요도 제일 높음
                boolean check = true;

                // 첫번쨰로 빼낸 문서의 중요도보다 높은 중요도가 있느지 확인
                for(int[] d : queue) {
                    if(d[1] > document[1]) {
                        check = false;
                        break;
                    }
                }

                if(check){ // true일 경우 제일 높은 문서
                    count++; // 출력 횟수 추가
                    if(document[0] == M) break; // 출력된 문서가 찾고자 하는 index일 경우 종료
                } else{
                    queue.offer(document);
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }
}
