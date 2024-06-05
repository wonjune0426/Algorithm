import java.io.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int N = Integer.parseInt(s.split(" ")[0]);
        int M = Integer.parseInt(s.split(" ")[1]);

        LinkedList<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            deque.offerLast(i);
        }

        s = br.readLine();

        int[] MList = new int[M];

        for (int i = 0; i < MList.length; i++) {
            MList[i] = Integer.parseInt(s.split(" ")[i]);
        }


        int count = 0;

        for (int i = 0; i < MList.length; i++) {
            while (true) {
                if (MList[i] == deque.getFirst()) {
                    deque.pollFirst();
                    break;
                } else {
                    if (deque.indexOf(MList[i]) <= deque.size() / 2) {
                        deque.offerLast(deque.pollFirst());
                        count++;
                    } else {
                        deque.offerFirst(deque.pollLast());
                        count++;
                    }
                }

            }
        }
        bw.write(count + "\n");
        bw.flush();
        br.close();
    }

}