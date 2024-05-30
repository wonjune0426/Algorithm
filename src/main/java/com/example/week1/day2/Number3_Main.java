package com.example.week1.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number3_Main {
    public static void main(String[] args) throws IOException {

        //입력을 받기 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 두 숫자를 입력 받음
        String input_String = br.readLine();
        // 숫자 하나씩 배열에 저장
        String[] s_split = input_String.split(" ");
        br.close();

        // 숫자를 뒤집기 위해서 char[] 배열로 분리
        char[] num1 = s_split[0].toCharArray();
        char[] num2 = s_split[1].toCharArray();

        // 자리교체를 위한 저장 자료형
        char saveChar;

        // 가운데 숫자는 변경이 없기 때문에 처음과 마지막 글자 교체
        saveChar=num1[0];
        num1[0]=num1[2];
        num1[2]=saveChar;

        saveChar=num2[0];
        num2[0]=num2[2];
        num2[2]=saveChar;

        // 배열을 문자열로 합치기 위한 Stringbuilder
        StringBuilder stringBuilder = new StringBuilder();

        // 교체된 첫번째 글자를 합침
        for(int i=0;i<num1.length;i++){
            stringBuilder.append(num1[i]);
        }

        // 크기 비교를 위한 int형 변수
        int changeNum1, changeNum2;

        // 합쳐진 문자열을 형변환을 통해 int형으로 저장
        changeNum1 = Integer.parseInt(stringBuilder.toString());
        // Stringbuilder 초기화
        stringBuilder.setLength(0);

        // 두번째 글자를 합침
        for(int i=0;i<num2.length;i++){
            stringBuilder.append(num2[i]);
        }

        // 크기 비교를 우한 int형 변수
        changeNum2 = Integer.parseInt(stringBuilder.toString());

        // 뒤집은 숫자로 크기 비교 후에 큰 숫자 출력
        if(changeNum1>changeNum2){
            System.out.println(changeNum1);
        } else{
            System.out.println(changeNum2);
        }

    }
}
