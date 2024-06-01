
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 끝말잇기 기록 수
        int N = Integer.parseInt(br.readLine());
        // 끝말잇기 가록을 저장할 List
        List<String> S = new ArrayList<>();

        // 기록의 단어들을 저장
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            S.add(word);

        }

        int M = Integer.parseInt(br.readLine());

        String[] A = new String[M];
        for (int i = 0; i < A.length; i++) {
            A[i] = br.readLine();
        }

        int wordIndex = S.indexOf("?");

        for (String str : A) {

            if (S.size() == 1) {
                bw.write(str);
                break;
            }

            char firstChar = str.charAt(0);
            char finalChar = str.charAt(str.length() - 1);

            if (S.contains(str)) continue;
            if (wordIndex == 0) {
                if (S.get(1).charAt(0) == finalChar) {
                    bw.write(str);
                    break;
                }
            } else if (wordIndex == S.size() - 1) {
                if (S.get(wordIndex - 1).charAt(S.get(wordIndex - 1).length() - 1) == firstChar) {
                    bw.write(str);
                    break;
                }
            } else {
                if (S.get(wordIndex - 1).charAt(S.get(wordIndex - 1).length() - 1) == firstChar && S.get(wordIndex + 1).charAt(0) == finalChar) {
                    bw.write(str);
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}

