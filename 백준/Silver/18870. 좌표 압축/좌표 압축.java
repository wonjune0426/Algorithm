import java.io.*;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        Map<Integer, Integer> map = new TreeMap<>();

        int y = 0;
        for (int i = 0; i < N; i++) {
            int s = Integer.parseInt(st.nextToken());
            arr[i] = s;
            map.put(s, 0);

        }

        int cnt = 0;

        for (Integer key : map.keySet()) {
            map.replace(key, cnt);
            cnt++;
        }


        for (int i = 0; i < N; i++) {
            if (map.containsKey(arr[i])) arr[i] = map.get(arr[i]);

            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();

    }
}
