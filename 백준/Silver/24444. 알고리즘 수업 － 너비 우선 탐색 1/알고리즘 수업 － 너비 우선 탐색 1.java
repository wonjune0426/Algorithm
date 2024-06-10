import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static StringTokenizer st;
    private static final List<List<Integer>> graph = new ArrayList<>();
    private static final Queue<Integer> queue = new LinkedList<>();

    private static boolean[] check;
    private static int[] result;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        // 정점의 갯수
        int N = Integer.parseInt(st.nextToken()) + 1;
        // 간선의 수
        int M = Integer.parseInt(st.nextToken());
        // 시작 정점
        int R = Integer.parseInt(st.nextToken());

        check = new boolean[N];
        result = new int[N];

        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int size = graph.size();

        for (int i = 0; i < size; i++) {
            Collections.sort(graph.get(i));
        }

        queue.add(R);

        int count = 1;
        while (!queue.isEmpty()) {
            int num = queue.poll();

            if(check[num]) continue;
            check[num] = true;
            result[num] = count;
            count++;


            for (int i = 0; i < graph.get(num).size(); i++) {
                if (!check[graph.get(num).get(i)]) {
                    queue.add(graph.get(num).get(i));

                }
            }

        }


        for (int i = 1; i < result.length; i++) {
            bw.write(result[i] + "\n");
        }
        bw.flush();
        bw.close();

    }

}
