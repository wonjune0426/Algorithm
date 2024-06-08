import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = br.readLine().toCharArray();
        Stack stack = new Stack();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(arr[i]);
            } else if (arr[i] == ')') {
                if (!stack.isEmpty()) stack.pop();
                else count++;
            }
        }

        bw.write(count + stack.size()+"\n");
        bw.flush();
        br.close();
    }
}
