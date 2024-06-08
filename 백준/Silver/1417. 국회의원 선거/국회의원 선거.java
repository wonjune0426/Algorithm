import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 후보수를 입력 받음
        int N = Integer.parseInt(br.readLine());

        // 다솜이의 득표수
        int dasom = Integer.parseInt(br.readLine());

        // 후보수 만큼의 배열 생성
        Integer[] arrN = new Integer[N - 1];

        //각각의 특표수를 저장
        for (int i = 0; i < N - 1; i++) {
            arrN[i] = Integer.parseInt(br.readLine());
        }

        // 매수할 득표 수
        int count = 0;

        // 후보자가 한명이라도 있을때
        if (arrN.length != 0) {
            while (true) {
                // 역순으로 정렬
                Arrays.sort(arrN, Collections.reverseOrder());
                // 다솜이의 득표 수 보다 크거나 같을 경우 표를 매수함
                if (dasom <= arrN[0]) {
                    dasom++;
                    arrN[0]--;
                    count++;
                } else break;
            }
        }


        bw.write(count + "");
        bw.flush();
        bw.close();

    }
}
