import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 줄 수 를 입력 받음
        int N = Integer.parseInt(br.readLine());

        // 별을 직기 위한 반복문
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j < i) bw.write(" "); // j가 i보다 작을 경우는 공백
                else bw.write("*");       // 아닐 경우 별을 찍음
            }
            bw.newLine();
        }

        br.close();

        bw.flush();
        bw.close();

    }
}
