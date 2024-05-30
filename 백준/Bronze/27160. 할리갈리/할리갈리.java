import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        String result = "NO";

        int N = sc.nextInt();

        String[] card = new String[N];
        int[] cardCount = new int[N];

        for (int i = 0; i < N; i++) {
            card[i] = sc.next();
            cardCount[i] =sc.nextInt();
        }

        for(int i=0;i<card.length;i++){
            switch (card[i]){
                case "STRAWBERRY":
                    arr[0]+=cardCount[i];
                    break;
                case "BANANA":
                    arr[1]+=cardCount[i];
                    break;
                case "LIME":
                    arr[2]+=cardCount[i];
                    break;
                case "PLUM":
                    arr[3]+=cardCount[i];
                    break;
            }
        }

        for(int s: arr){
            if (s == 5) {
                result = "YES";
                break;
            }
        }

        System.out.println(result);

    }
}