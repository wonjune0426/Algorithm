import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 사람의 수
        int N = Integer.parseInt(br.readLine());

        // 걸리는 시간을 저장할 배열
        int[] people = new int[N];

        String s = br.readLine();

        // 각 시간을 배열에 저장함
        for (int i = 0; i < N; i++) {
            people[i] = Integer.parseInt(s.split(" ")[i]);
        }

        br.close();

        // 작은 수가 앞에오는 것이 시간이 제일 적게 걸리므로 
        // 오름차순 정렬
        Arrays.sort(people);

        // 총 시간을 구할 변수
        int sum = 0;
        // 중간값 저장 변수
        int y = 0;

        // 시간을 구하기 위한 반복문
        for (int i = 0; i < N; i++) {
            y += people[i]; // 그 전의 사간들과 현재 시간을 더함 
            sum += y;  // 총 합을 더함 
        }

        bw.write(sum + "\n");
        bw.flush();
        bw.close();

    }

}
