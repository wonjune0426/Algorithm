
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // testcase의 수
        int testCase = Integer.parseInt(br.readLine());

        // 학교 이름
        String S = "";
        // 제일 많이 소비한 술의 양
        int L;

        // testcase만큼 반복
        for (int i = 0; i < testCase; i++) {
            L = 0;
            int N = Integer.parseInt(br.readLine());
            for (int j = 0; j < N; j++) {
                String s = br.readLine();
                String name = s.split(" ")[0];
                int num = Integer.parseInt(s.split(" ")[1]);

                if (num > L) {
                    S = name;
                    L = num;
                }
            }
            bw.write(S + "\n");
        }

        br.close();

        bw.flush();
        bw.close();

    }
}
