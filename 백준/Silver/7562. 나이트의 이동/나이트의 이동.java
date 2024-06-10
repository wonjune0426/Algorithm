import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static final int[] move_X = {-2, -2, -1, -1, 1, 1, 2, 2};
    private static final int[] move_Y = {-1, 1, 2, -2, -2, 2, 1, -1};

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static StringTokenizer st;

    // 각 위치의 탐색 여주 저장
    private static boolean[][] check;

    private static int map;

    public static void main(String[] args) throws IOException {

        // 테스트 케이스 수
        int N = Integer.parseInt(br.readLine());

        // 케이스 수 만큼 반복
        for (int i = 0; i < N; i++) {
            // 체스판의 크기
            map = Integer.parseInt(br.readLine());

            // 체스판의 크기 만큼 위치 저장 배열 크기 기정
            check = new boolean[map][map];

            // 초기 X,Y값 지정
            st = new StringTokenizer(br.readLine(), " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 도착 지점 X,Y값 지정
            st = new StringTokenizer(br.readLine(), " ");

            int end_X = Integer.parseInt(st.nextToken());
            int end_Y = Integer.parseInt(st.nextToken());

            // bfs탐색
            int result = bfs(x, y, end_X, end_Y);
            bw.write(result + "\n");

        }
        bw.flush();
        bw.close();
    }

    private static int bfs(int x, int y, int endX, int endY) {
        check[x][y] = true;

        // 시작 지점과 종료 지점이 같을 경우 0 리턴
        if (x == endX && y == endY) return 0;

        // bfs 탐색을 위한 queue
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y, 0});


        while (!q.isEmpty()) {
            int[] checkInfo = q.poll();
            int count = checkInfo[2];

            for (int i = 0; i < move_X.length; i++) {
                int check_X = move_X[i] + checkInfo[0];
                int check_Y = move_Y[i] + checkInfo[1];

                if (check_X < 0 || check_Y < 0 || check_X >= map || check_Y >= map) continue;
                if (check[check_X][check_Y]) continue;
                if (check_X == endX && check_Y == endY) {
                    return count + 1;
                }
                check[check_X][check_Y] = true;
                q.add(new int[]{check_X, check_Y, count + 1});

            }

        }
        return -1;
    }
}
