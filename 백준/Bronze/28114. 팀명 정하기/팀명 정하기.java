import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        Integer[] years = new Integer[3];
        Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int count = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            years[i] = year;
            map.put(count, name);
        }

        br.close();

        Arrays.sort(years);

        for(int num : years) {
            bw.write(String.valueOf(num%100));
        }

        bw.newLine();

        for(Integer key : map.keySet()) {
            bw.write(map.get(key).charAt(0));
        }

        bw.flush();
        bw.close();
    }
}
