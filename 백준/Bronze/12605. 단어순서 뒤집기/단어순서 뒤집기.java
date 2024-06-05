
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 문장의 갯수
        int N = Integer.parseInt(br.readLine());

        // 입력된 문자를 저장
        List<String[]> L = new ArrayList<>();

        // 문장의 갯수만큼 반복하여 List에 담는다.
        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            L.add(s.split(" "));
        }

        // 단어들을 반대로 출력하기 위한 stack
        Stack<String> stack = new Stack<>();

        // 각 문장들을 stack에 담고 출력하는 반복문
        for(int i = 0; i < L.size(); i++) {
            bw.write("Case #"+(i+1)+": ");

            // 각 문장들을 stack에 담음
            for(int j = 0; j < L.get(i).length; j++) {
                stack.push(L.get(i)[j]);
            }

            // 반대로 출력하기 위해 하나씩 pop
            for(int k=0; k < L.get(i).length; k++) {
                bw.write(stack.pop()+" ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();


    }
}
