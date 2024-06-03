import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String size = br.readLine();

        int N = Integer.parseInt(size.split(" ")[0]);
        int M = Integer.parseInt(size.split(" ")[1]);

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        for (int i = 0; i < A.length; i++) {
            String s = br.readLine();
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = Integer.parseInt(s.split(" ")[j]);
            }
        }

        for (int i = 0; i < B.length; i++) {
                String s = br.readLine();
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = Integer.parseInt(s.split(" ")[j]);
                bw.write(A[i][j] + B[i][j]+" ");
            }
            bw.newLine();
        }


        br.close();

        bw.flush();
        bw.close();

    }
}
