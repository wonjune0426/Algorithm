import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 상근이가 가지고 있는 카드의 수
        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){
            if(set.contains(Integer.parseInt(st.nextToken()))) bw.write(1 + " ");
            else bw.write(0 + " ");
        }

        br.close();

        bw.flush();
        bw.close();


    }
}
