import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.valueOf(br.readLine());

        ArrayList<String> enterMember = new ArrayList<>();

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < count; i++) {
            String s = br.readLine();
            map.put(s.split(" ")[0], s.split(" ")[1]);
        }
        br.close();


        for (String key : map.keySet()) {
            if (map.get(key).equals("enter")) {
                enterMember.add(key);
            }
        }

        Collections.sort(enterMember);
        Collections.reverse(enterMember);

        for(String s : enterMember) {
            System.out.println(s);
        }

    }
}
