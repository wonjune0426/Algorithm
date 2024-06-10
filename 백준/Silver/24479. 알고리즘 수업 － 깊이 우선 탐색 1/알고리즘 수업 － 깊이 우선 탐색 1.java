import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    // 방문한 정점을 기록할 배열
    private static int[] arrN;

    // 방문 순서
    private static int count = 1;

    // 정점의 정보를 기록할 그래프
    private static List<List<Integer>> graph = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //정점의 갯수
        int N = Integer.parseInt(st.nextToken());
        // 간선의 수
        int M = Integer.parseInt(st.nextToken());
        // 시작 정점
        int R = Integer.parseInt(st.nextToken());

        // 기록할 배열의 크기를 정점의 갯수만큼 지정
        arrN = new int[N + 1];


        // 정점의 인접 정보를 위한 리스트를 정점의 갯수만큼 만들어줌
        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선의 갯수만큼 반복하여 인접 정보 저장
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            // 양방향이기 때문에 양쪽에 인접 정보 저장
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // 인접 정보들을 오름차순으로 정렬함
        for (int i = 1; i < graph.size(); i++) {
            Collections.sort(graph.get(i));
        }

        // 깊이 우선 탐색
        dfs(R);

        for (int i = 1; i < arrN.length; i++) {
            bw.write(arrN[i] + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static void dfs(int R) {
        // 정점의 탐색순서를 저장
        arrN[R] = count;

        // 각 정점의 인접 정보를 순회함
        for (int i = 0; i < graph.get(R).size(); i++) {
            int getN = graph.get(R).get(i);

            if (arrN[getN] == 0) {   // 탐색순서를 저장한 배열에서 순서가 0이면
                count++;             // 순서를 1씩 증가
                dfs(getN);           // method 다시 호출
            }
        }
    }
}
