import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static int selectRange;   // 값을 뽑을 범위
    private static int[] selectNum;   // 뽑은 값들을 저장할 배열
    private static boolean[] visited; // 해당 값을 뽑았는지 확인하는 flag 배열

    // 경우의 수 카운트 변수
    private static int count;

    public static void main(String[] args) throws IOException {
        selectRange = Integer.parseInt(br.readLine());
        selectNum = new int[selectRange]; // 뽑아야 하는 갯수만큼 크기 지정

        // 인덱스는 0부터 시작하기 때문에 +1
        visited = new boolean[selectRange + 1];

        // 순열 메서드
        findPermutations(0);

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

    private static void findPermutations(int selectCount) {
        // 뽑은 갯수가 목표에 도달하면 count 1증가 후 return
        if (selectCount == selectNum.length) {
            count++;
            return;
        }

        // 1부터 범위까지 반복하며 뽑을 갯수까지 반복
        for (int i = 1; i <= selectRange; i++) {
            if (visited[i]) continue; // 이미 뽑은 값은 건너 뜀

            selectNum[selectCount] = i; // 뽑은 값을 배열에 저장
            visited[i] = true;          // 뽑은 숫자 flag 변경

            // 다음 순번의 값을 뽑기 위한 재귀 호출
            findPermutations(selectCount + 1);
            visited[i] = false;         // 뽑았던 값의 flag 다시 변경
        }
    }


}
