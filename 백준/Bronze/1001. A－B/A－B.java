import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
        System.out.println(Integer.parseInt(inputString.split(" ")[0])-Integer.parseInt(inputString.split(" ")[1]));
        br.close();

    }
}
