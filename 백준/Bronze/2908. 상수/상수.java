import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input_String = br.readLine();
        String[] s_split = input_String.split(" ");
        br.close();


        char[] num1 = s_split[0].toCharArray();
        char[] num2 = s_split[1].toCharArray();

        char saveChar;

        saveChar=num1[0];
        num1[0]=num1[2];
        num1[2]=saveChar;

        saveChar=num2[0];
        num2[0]=num2[2];
        num2[2]=saveChar;

        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0;i<num1.length;i++){
            stringBuilder.append(num1[i]);
        }

        int changeNum1, changeNum2;

        changeNum1 = Integer.parseInt(stringBuilder.toString());
        stringBuilder.setLength(0);

        for(int i=0;i<num2.length;i++){
            stringBuilder.append(num2[i]);
        }

        changeNum2 = Integer.parseInt(stringBuilder.toString());

        if(changeNum1>changeNum2){
            System.out.println(changeNum1);
        } else{
            System.out.println(changeNum2);
        }

    }
}
