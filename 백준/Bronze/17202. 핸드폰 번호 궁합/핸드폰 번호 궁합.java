import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String s = br.readLine();

        // 첫 번째 전화번호 저장 배열
        int[] A = new int[8];
        for (int i = 0; i < 8; i++) {
            A[i] = Integer.parseInt(s.split("")[i]);
        }

        s = br.readLine();

        // 두 번째 전화번호 저장 배열
        int[] B = new int[8];
        for (int i = 0; i < 8; i++) {
            B[i] = Integer.parseInt(s.split("")[i]);
        }

        // 번호를 더한 값을 저장할 queue
        Queue<Integer> queue = new LinkedList<>();

        // 처음 전화번호를 번갈아 queue에 저장
        for(int i = 0; i < 8; i++){
            queue.add(A[i]);
            queue.add(B[i]);
        }

        // 반복할 횟수 저장 변수
        int cycle = 15;

        // queue의 size가 2가 될떄까지 반복
        while(queue.size()!=2){
            for(int i = 0; i < cycle; i++){
                int a = queue.poll(); // queue의 값을 꺼냄
                int b = queue.peek(); // 꺼내고 난 후 첫번째 값

                queue.add((a+b)%10);  // queue 추가
            }
            queue.poll();  // cycle의 마지막 번호를 버림

            cycle--;
        }

        br.close();

        bw.write(String.valueOf(queue.poll())+String.valueOf(queue.poll()));
        bw.flush();
        bw.close();

    }
}
