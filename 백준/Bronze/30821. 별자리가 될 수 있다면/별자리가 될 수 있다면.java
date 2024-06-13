import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    private static int range;        // 값을 찾을 범위
    private static int[] selectNum;  // 값을 선택해서 저장할 배열 
    private static int count;        // 갯수를 카운트할 변수

    public static void main(String[] args) throws IOException {
        range = Integer.parseInt(br.readLine());

        // 5개의 값을 뽑아야 함으로 +1해서 6
        selectNum = new int[6];

        // 조합 갯수 찾는 메서드
        findCombination(0, 0);

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

    private static void findCombination(int cnt, int start) {
        if (cnt == 5) { // 5개를 전부 뽑았을 경우 count ++;
            count++;
            return;
        }

        // 뽑은 값 다음 부터 뽑기 위한 반복
        for (int i = start + 1; i <= range; i++) { 
            selectNum[cnt] = i;
            
            findCombination(cnt + 1, i);
        }
    }
}
