import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        //테스트 케이스
        int N = Integer.parseInt(br.readLine());

        // 값을 더할 우선순위 큐
        PriorityQueue<Long> pq = new PriorityQueue<>();


        for (int i = 0; i < N; i++) {
            long sum = 0;

            int count = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < count; j++) {
                pq.offer(Long.valueOf(st.nextToken()));
            }

            while (!pq.isEmpty()) {
                if (pq.size() == 1) break;
                long first = pq.poll();
                long second = pq.poll();
                sum += first + second;
                pq.offer(first + second);
            }

            pq.clear();

            bw.write(sum + "\n");
        }

        bw.flush();
        bw.close();
    }
}
