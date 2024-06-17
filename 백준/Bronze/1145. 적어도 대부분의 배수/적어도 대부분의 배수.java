import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        // 숫자들을 입력 받음
        String N = br.readLine();

        // 각각의 숫자들을 저장항 배열
        int[] arr = new int[5];


        // 최소값부터 증가 시킬 변수 저장
        int num = 100;

        // 숫자 한개씩 저장
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(N.split(" ")[i]);
            num = Math.min(num, arr[i]);
        }


        while (true) {
            int count = 0; // 배수인지 count

            for (int i = 0; i < 5; i++) {
                if (num % arr[i] == 0) count++; // 0으로 나누어 떨어지면 배수 이므로 count++
            }


            if (count >= 3) {  // count가 3이상일 경우 해당 값 출력하고 종료
                bw.write(String.valueOf(num));
                break;
            }

            num++;

        }

        bw.flush();
        bw.close();

    }
}
