import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static final boolean[] check = new boolean[100001];
    private static int result;

    private static final Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 수빈이의 위치
        int N = Integer.parseInt(st.nextToken());

        // 동생의 위치
        int M = Integer.parseInt(st.nextToken());


         if(N!=M)queue.add(new int[]{N, 0});


        boolean find = false;
        while (!queue.isEmpty()) {
            int[] moveInfo = queue.poll();

            int locate = moveInfo[0];
            int cnt = moveInfo[1];

            check[locate] = true;


            if (locate - 1 >= 0 && !check[locate - 1]) {
                if (locate - 1 == M) {
                    result = cnt + 1;
                    find = true;
                }
                queue.add(new int[]{locate - 1, cnt + 1});
            }
            if (locate + 1 <= 100000 && !check[locate + 1]) {
                if (locate + 1 == M) {
                    result = cnt + 1;
                    find = true;
                }
                queue.add(new int[]{locate + 1, cnt + 1});
            }

            if (2 * locate <= 100000 && !check[2 * locate]) {
                if (2 * locate == M) {
                    result = cnt + 1;
                    find = true;
                }
                queue.add(new int[]{2 * locate, cnt + 1});
            }

            if (find) break;

        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }

}
