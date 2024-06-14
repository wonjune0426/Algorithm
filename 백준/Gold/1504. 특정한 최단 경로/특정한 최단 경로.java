import java.io.*;
import java.util.*;


public class Main {
    static class Node implements Comparable<Node> {
        private int index;
        private int weight;

        public Node(int index, int weight) {
            this.index = index;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.weight, o.weight);
        }
    }

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static List<List<Node>> graph = new ArrayList<>();

    private static int[] distance;  // 경로 저장 배열

    private static int N;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        // 정점의 갯수
        N = Integer.parseInt(st.nextToken());

        // graph 정점의 갯수 만큼 생성
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }

        // 경로 저장 배열 크기 지정 및 초기값 지정
        distance = new int[N];

        // 간성의 갯수
        int E = Integer.parseInt(st.nextToken());

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken()) - 1; // 시작ㄴ드 (경로 저장시 index 0부터 시작이기 때문에 -1)
            int end = Integer.parseInt(st.nextToken()) - 1;   // 도착노드 (경로 저장시 index 0부터 시작이기 때문에 -1)
            int weight = Integer.parseInt(st.nextToken());    // 가중치

            graph.get(start).add(new Node(end, weight));
            graph.get(end).add(new Node(start, weight));
        }

        st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken()) - 1; // 거쳐야 하는 첫번째 노드
        int num2 = Integer.parseInt(st.nextToken()) - 1; // 거쳐야 하는 두번째 노드


        long sum1 = 0;

        sum1 += Dijkstra(0, num1);
        sum1 += Dijkstra(num1, num2);
        sum1 += Dijkstra(num2, N - 1);

        long sum2 = 0;

        sum2 += Dijkstra(0, num2);
        sum2 += Dijkstra(num2, num1);
        sum2 += Dijkstra(num1, N - 1);

        if (sum1 < Integer.MAX_VALUE && sum2 < Integer.MAX_VALUE) {
            bw.write(String.valueOf(Math.min(sum1, sum2)));
        } else {
            bw.write("-1");
        }


        bw.flush();
        bw.close();
    }

    private static int Dijkstra(int start, int end) {
        PriorityQueue<Node> pq = new PriorityQueue<>();

        // 가중치의 값을 최대로 초기화
        Arrays.fill(distance, Integer.MAX_VALUE);

        // 시작 노드의 index 0으로 지정
        distance[start] = 0;

        // Queue에 시작 노드 추가
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int nodeIndex = node.index;
            int weight = node.weight;

            if (weight < distance[nodeIndex]) continue;

            for (Node s : graph.get(nodeIndex)) {
                if (weight + s.weight < distance[s.index]) {
                    //최단 테이블 갱신
                    distance[s.index] = weight + s.weight;
                    // 갱신 된 노드를 우선순위 큐에 넣어
                    pq.offer(new Node(s.index, distance[s.index]));
                }
            }
        }

        return distance[end];

    }
}
