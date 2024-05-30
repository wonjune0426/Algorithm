
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(br.readLine());
        String[] scores = br.readLine().split(" ");
        br.close();

        int maxNum = 0;
        double sumScore = 0;

        int[] arrScores = new int[scores.length];

        for (int i = 0; i < scores.length; i++) {
            arrScores[i] = Integer.parseInt(scores[i]);
            if (arrScores[i] > maxNum) {
                maxNum = arrScores[i];
            }
            sumScore += arrScores[i];
        }

        System.out.println((double) (sumScore / count) / maxNum * 100);


    }
}
