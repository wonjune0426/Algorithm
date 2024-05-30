import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        String[] str = new String[t];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            str[i] = sc.next();
        }
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            char[] c = str[i].toCharArray();
            for (int j = 0; j < c.length; j++) {
                for (int k = 0; k < arr[i]; k++) {
                    stringBuilder.append(c[j]);
                }
            }
            str[i] = stringBuilder.toString();
            stringBuilder.setLength(0);
            System.out.println(str[i]);
        }
        
    }
}