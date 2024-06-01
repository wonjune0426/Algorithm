import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        br.close();

        char[] number = s.split(" ")[0].toCharArray();
        int B = Integer.parseInt(s.split(" ")[1]);

        int result = 0;
        int counter = 0;

        for (int i = number.length - 1; i >= 0; i--) {
            if (number[i] >= '0' && number[i] <= '9') {
                result += (number[i] - '0') * power(B, counter);
            } else {
                result += (number[i] - 55) * power(B, counter);
            }

            counter++;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }

    static int power(int a, int b) {
        int returnNum = 1;
        for (int i = 0; i < b; i++) {
            returnNum *= a;
        }
        return returnNum;
    }
}