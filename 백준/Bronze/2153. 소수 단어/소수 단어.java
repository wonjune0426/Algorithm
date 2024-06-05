import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력받은 단어를 각각의 글자 배열로 저장
        char[] chars = br.readLine().toCharArray();
        br.close();

        // 각 글자를 숫자로 변환한 값을 저장하기 위한 변수
        int sum = 0;

        // 각 글자의 아스키 코드에서 문제가 제시하는 범위만큼 숫자를 뺴준다.
        for (char c : chars) {
            if (c >= 97 && c <= 122) sum += c - 96;
            else sum += c - 38;
        }

        // 소수 판별을 위한 boolean
        boolean check =true;

        // 2부터 sum-1까지 반복하여 나누어 떨어지는 수가 있을 경우 소수 아님
        for(int i=2;i<sum;i++){
            if(sum%i==0){
                 check=false;
                break;
            }
        }

        // 소수를 판별하여 결과 출력
        if(check){
            bw.write("It is a prime word.");
        } else{
            bw.write("It is not a prime word.");
        }

        bw.flush();
        bw.close();


    }
}
