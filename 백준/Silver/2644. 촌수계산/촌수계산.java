import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static boolean[] visited; // 방문여부 저장 배열
    private static List<List<Integer>> graph = new ArrayList<>();

    // 촌수 계산 값 저장 변수
    private static int result = -1;

    public static void main(String[] args) throws IOException {

        // 정점의 수
        int n = Integer.parseInt(br.readLine()) + 1;

        // 방문여부 저장 배열 초기화
        visited = new boolean[n];

        // 그래프 초기화
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        st = new StringTokenizer(br.readLine(), " ");

        // 촌수를 확인할 정점들
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        // 간선의 갯수
        int N = Integer.parseInt(br.readLine());

        // 정점의 접점 정보 저장
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graph.get(start).add(end);
            graph.get(end).add(start);
        }


        // dfs 재귀 호출
        dfs(x, y, 0);
        bw.write(result + "\n");
        bw.flush();
        bw.close();

    }

    private static void dfs(int x, int y, int cnt) {
        visited[x] = true; // 해당 정점 방문여부 true로 변경

        for (int i = 0; i < graph.get(x).size(); i++) {
            if (!visited[graph.get(x).get(i)]) { // 해당 정점과 인접한 정점 중 탐색을 안한 정점 추출
                if (y == graph.get(x).get(i)) {  // 정점의 값이 찾으려는 값이면 재귀 종료
                    result = cnt + 1;
                    return;
                }
                dfs(graph.get(x).get(i), y, cnt + 1);
            }
        }
    }


}
