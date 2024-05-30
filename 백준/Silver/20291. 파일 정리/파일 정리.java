import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String,Integer> strings = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String s =br.readLine().split("\\.")[1];
            strings.put(s, strings.getOrDefault(s, 0) + 1);
        }

        for (String key : strings.keySet()) {
            System.out.println(key+" "+strings.get(key));
        }

    }
}
