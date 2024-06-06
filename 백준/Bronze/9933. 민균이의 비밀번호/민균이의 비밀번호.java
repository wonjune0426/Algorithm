import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 단어의 갯수
        int N = Integer.parseInt(br.readLine());

        // 단어들을 저장할 배열
        String[] words = new String[N];

        // 배열에 단어들 하나씩 저장
        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        br.close();

        // 문자열을 뒤집기 위한 stringBuilder 객체
        StringBuilder stringBuilder;

        // 반복문 탈출을 위한 flag 변수
        boolean check = false;

        // 입력된 단어들을 뒤접에 보면서 비밀번호 확인
        for (String word : words) {
            stringBuilder = new StringBuilder(word).reverse();  // 뒤집은 문자
            for (String s :words) { // 자기 자신도 확인해야 하기 때문에 입력된 문자 전체 반복
                if (stringBuilder.toString().equals(s)) {
                    bw.write(word.length() + " " + word.charAt(word.length() / 2));
                    check = true;
                }
            }
            if (check) break;

        }


        bw.flush();
        bw.close();

    }
}
