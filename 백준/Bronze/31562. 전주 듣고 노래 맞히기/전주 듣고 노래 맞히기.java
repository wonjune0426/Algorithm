import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String s = br.readLine();

        // 음을 아는 노래의 개수
        int N = Integer.parseInt(s.split(" ")[0]);
        // 맞히기를 시도할 노래 개수
        int M = Integer.parseInt(s.split(" ")[1]);

        // 노래와 음을 저장할 HashMap
        // Key = 노래제목 / Value = 음
        Map<String, String> map = new HashMap<>();

        // 노래 정보를 저장
        // 음은 3개만 비교함
        for (int i = 0; i < N; i++) {
            String song = br.readLine();
            map.put(song.split(" ")[1],song.split(" ")[2] + song.split(" ")[3] + song.split(" ")[4]);
        }

        // 저장한 음과 게임의 음의 일치개수 저장 변수
        int count;
        // 노래제목
        String songName = "";

        // game에서 제시한 음을 입력받음
        for (int i = 0; i < M; i++) {
            count = 0;
            // 음사이의 공백을 제거
            String game = br.readLine().replaceAll(" ", "");

            // map에 저장한 음들을 하나씩 비교
            for (String str : map.keySet()) {
                if (game.equals(map.get(str))) {
                    count++;
                    songName = str;
                    if(count >=2) break;  // 같은게 2개이상이면 반복문 탈출
                }
            }

            // 문제에서 제시한 조건에 맞게 출력
            if (count == 2) bw.write("?\n");
            else if (count ==1) bw.write(songName+"\n");
            else bw.write("!\n");
        }

        br.close();

        bw.flush();
        bw.close();


    }
}
