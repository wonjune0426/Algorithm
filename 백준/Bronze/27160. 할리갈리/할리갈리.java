import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[4];
        String result = "NO";

        int N = Integer.parseInt(br.readLine());

        String[] card = new String[N];
        int[] cardCount = new int[N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            card[i] = s.split(" ")[0];
            cardCount[i] = Integer.parseInt(s.split(" ")[1]);
        }

        br.close();
        
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

        bw.write(result);
        bw.flush();
        bw.close();

    }
}