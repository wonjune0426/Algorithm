import java.io.*;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        // 입력되는 수의 갯수
        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        // 초기 값을 저장하기 위한 배열
        int[] arr = new int[N];

        // 정렬을 통해서 값을 변경하기 위한 TreeMap
        Map<Integer, Integer> map = new TreeMap<>();

        // 반복문을 통해 배열과 TreeMap에 저장 초기 값은 1로 둠
        for (int i = 0; i < N; i++) {
            int s = Integer.parseInt(st.nextToken());
            arr[i] = s;
            map.put(s, 0);

        }

        int cnt = 0;

        // 정렬된 상태의 TreeMap에서 작은 값 0부터 1씩 늘려 value 변경
        for (Integer key : map.keySet()) {
            map.replace(key, cnt);
            cnt++;
        }


        // 원본 배열과 map의 key를 비교하여 value 값으로 변경 후 출력
        for (int i = 0; i < N; i++) {
            if (map.containsKey(arr[i])) arr[i] = map.get(arr[i]);

            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();

    }
}
