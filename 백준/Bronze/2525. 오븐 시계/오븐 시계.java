import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int hour = Integer.parseInt(s.split(" ")[0]);
        int minute = Integer.parseInt(s.split(" ")[1]);

        int makeTime = Integer.parseInt(br.readLine());

        hour += (makeTime + minute) / 60;
        if (hour >= 24) hour -= 24;
        minute = (makeTime + minute) % 60;


        bw.write(hour + " " + minute);


        bw.flush();
        bw.close();

    }
}
