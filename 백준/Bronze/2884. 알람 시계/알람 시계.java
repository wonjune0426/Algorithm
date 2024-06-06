import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int hour = Integer.parseInt(s.split(" ")[0]);
        int minute = Integer.parseInt(s.split(" ")[1]);

        if (minute < 45) {
            if (hour == 0) hour = 23;
            else hour -= 1;
            minute = minute + 15;
        } else minute -= 45;

        bw.write(hour + " " + minute);

        bw.flush();
        bw.close();

    }
}
