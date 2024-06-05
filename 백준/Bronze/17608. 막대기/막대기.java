
import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 막대기의 갯수
        int N = Integer.parseInt(br.readLine());

        // 오른쪽부터 확인하기 위해 stack에 담는다
        Stack<Integer> stack = new Stack<>();

        // 막대기 갯수만큼 stack에 저장
        for (int i = 0; i < N; i++) {
            stack.push(Integer.valueOf(br.readLine()));
        }

        // 제일 오른쪽의 크기 저장
        int h = stack.peek();

        br.close();


        // 오른쪽에서봤을때 보이는 막대기의 갯수 오른쪽 한개는 보이기 떄문
        int count = 1;

        // stack에서 빼낸 숫자 저장
        int popN = 0;

        // 스택에서 하나씩 뺴면서 갯수 확인
        for (int j = 0; j < N; j++) {
            popN = stack.pop();
            // 오른쪽 막대기와 크기 비교 중 큰 값을 저장 하고 카운트 
            if (h < popN) {
                h = popN;
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }
}
