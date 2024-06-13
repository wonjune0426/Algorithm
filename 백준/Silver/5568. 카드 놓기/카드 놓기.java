import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 카드를 뽑아 조합한 수를 저장할 배열
    private static final Set<String> set = new HashSet<>();

    private static int[] arrN; // 카드들을 저장할 배열
    private static boolean[] visited;
    private static int[] arrM; // 뽑은 카드를 저장할 배열



    private static StringBuffer sb = new StringBuffer();


    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        arrN = new int[n];
        visited = new boolean[n];

        int m = Integer.parseInt(br.readLine());
        arrM = new int[m];

        for (int i = 0; i < n; i++) {
            arrN[i] = Integer.parseInt(br.readLine());
        }


        findPermutations(0);

        bw.write(set.size()+"");
        bw.flush();
        bw.close();
    }

    private static void findPermutations(int cnt) {
        if (cnt == arrM.length) {
            for(int s : arrM){
                sb.append(s);
            }
            set.add(sb.toString());
            sb.setLength(0);
            return;
        }

        for(int i =0; i<arrN.length; i++){
            if(visited[i]) continue;
            arrM[cnt] = arrN[i];

            visited[i] = true;
            findPermutations(cnt+1);
            visited[i] = false;
        }
    }


}
