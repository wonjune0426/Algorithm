import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 년도을 저장할 배열
        Integer[] years = new Integer[3];

        // key - 문제 수 / value - 이니셜
        // 문제수가 많은 사람부터 이니셜을 뽑아야 함으로 역순으로 정렬
        Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());

        // 3명의 정보를 입력받는 반복문
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int count = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            years[i] = year;
            map.put(count, name);
        }

        br.close();

        // 년도를 오름차순으로 정렬
        Arrays.sort(years);

        // 첫 번째 방법 각 년도를 100으로 나눈 나머지를 출력
        for(int num : years) {
            bw.write(String.valueOf(num%100));
        }

        bw.newLine();

        // 이름의 이니셜을 추출해서 출력
        for(Integer key : map.keySet()) {
            bw.write(map.get(key).charAt(0));
        }

        bw.flush();
        bw.close();
    }
}
