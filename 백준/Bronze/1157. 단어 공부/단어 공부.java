import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        br.close();

        char[] chars = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        int maxNum = 0;
        char maxChar = '?';

        for(char c : chars) {
            if (map.containsKey(c)) {
                map.put(c,map.get(c)+1);
            } else{
                map.put(c,1);
            }

            if(map.get(c) > maxNum){
                maxNum = map.get(c);
                maxChar = c;
            }
        }


        map.remove(maxChar);

        for(Integer i : map.values()){
            if(maxNum == i){
                maxChar = '?';
            }
        }

        System.out.println(maxChar);

    }
}
