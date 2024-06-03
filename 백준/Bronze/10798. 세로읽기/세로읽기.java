import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder[] strings = new StringBuilder[5];
        int maxLength = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            strings[i] = new StringBuilder(br.readLine());
            if (maxLength < strings[i].length()) {
                maxLength = strings[i].length();
            }
        }


        for (int i = 0; i < 5; i++) {
            if (strings[i].length() < maxLength) {
                int s = maxLength - strings[i].length();
                for (int j = 0; j <= s ; j++) {
                    strings[i].append("_");
                }
            }
        }



        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < strings.length; j++) {
                result.append(strings[j].charAt(i));
            }
        }

        bw.write(result.toString().replaceAll("_",""));


        br.close();

        bw.flush();
        bw.close();
    }
}
