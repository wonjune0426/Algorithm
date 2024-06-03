
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());

        // 가로로 누울자리
        int horizontalCount = 0;
        // 세로로 누울자리
        int verticalCount = 0;

        char[][] room = new char[size][size];


        for (int i = 0; i < room.length; i++) {
            String s = br.readLine();
            for (int j = 0; j < room[i].length; j++) {
                room[i][j] = s.charAt(j);
            }
        }

        br.close();

        int count = 0;

        for (char[] chars : room) {
            count = 0;
            for (int j = 0; j < chars.length; j++) {
                count ++;
                if (chars[j] == 'X') {
                    if (count >2) {
                        horizontalCount++;
                    }
                    count = 0;
                } else if (j == chars.length - 1 && count >= 2) {
                    horizontalCount++;
                }
            }
        }

        for (int i = 0; i < room.length; i++) {
            count = 0;
            for (int j = 0; j < room[i].length; j++) {
                    count++;
                if (room[j][i] == 'X') {
                    if (count > 2) {
                        verticalCount++;
                    }
                    count = 0;
                } else if (j == room.length - 1 && count >= 2) {
                    verticalCount++;
                }
            }
        }


        bw.write(horizontalCount+" "+verticalCount);
        bw.flush();
        bw.close();


    }
}
