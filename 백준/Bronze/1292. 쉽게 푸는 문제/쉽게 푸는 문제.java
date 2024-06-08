import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        // 구간의 시작
        int A = Integer.parseInt(s.split(" ")[0]);
        // 구간의 끝
        int B = Integer.parseInt(s.split(" ")[1]);


        int count = 0;  // 자릿수 확인을 위한 변수
        int sum = 0;    // 합을 더할 변수

        for (int i = 1; i <= B; i++) {
            for (int j = 1; j <= i; j++) {
                count++;

                if (count >= A && count <= B) {
                    sum += i;
                }
            }
            if(count >= B)break;
        }

        br.close();

        bw.write(sum+"");
        bw.flush();
        bw.close();
    }
}
