import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();

        // 사전의 오름차순으로 정렬이 필요 각 글자의 갯수 확인 필요
        Map<Character, Integer> map = new TreeMap<>();


        // 문자를 글자형 배열로 입력 받음
        char[] chars = br.readLine().toCharArray();

        // 각 글자를 키로 횟수를 저장
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }

        int start = 0;
        int end = 0;
        char midChar = 0;

        // 글자의 길이가 크기가 짝수 일때
        if (chars.length % 2 == 0) {
            for (char c : map.keySet()) {
                if (map.get(c) % 2 != 0) {
                    sb.setLength(0);
                    sb.append("I'm Sorry Hansoo");
                    break;
                } else {
                    for (int i = 0; i < map.get(c) / 2; i++) {
                        sb.insert(start++, c);
                        sb.insert(sb.length() - end++, c);
                    }
                }
            }
            bw.write(sb.toString());
        }
        // 홀수 일 때
        else {
            int count = 0;
            for (char c : map.keySet()) {
                if (map.get(c) % 2 != 0) {
                    count++;
                    midChar = c;
                }
                if (count >= 2) {
                    sb.setLength(0);
                    sb.append("I'm Sorry Hansoo");
                    break;
                } else {
                    for (int i = 0; i < map.get(c) / 2; i++) {
                        sb.insert(start++, c);
                        sb.insert(sb.length() - end++, c);
                    }
                }
            }
            if (count < 2) sb.insert(sb.length() / 2, midChar);
            bw.write(sb.toString());
        }


        bw.flush();
        bw.close();
    }
}
