package com.example;

import java.util.Scanner;

public class Number3_Main {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder(); // 각각의 글자를 반복하기 위한 StringBuilder 객체
        Scanner sc = new Scanner(System.in);               // 입력을 받기 위한 Scanner

        int t = sc.nextInt();                              // 반복할 문자열의 갯수를 입력 받음
        int[] arr = new int[t];                            // 반복횟수를 저장항 배열을 생성 - legnth는 초기 입력된 숫자
        String[] str = new String[t];                      // 문자열을 저장할 배열 생성  - legnth는 초기 입력된 숫자

        for (int i = 0; i < arr.length; i++) {             // Scanner를 통해 반복횟수와 문자열을 입력 받음
            arr[i] = sc.nextInt();
            str[i] = sc.next();
        }
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            char[] c = str[i].toCharArray();                // 입력받은 문자열을 한글자씩 추출하기 위해 배열로 저장
            for (int j = 0; j < c.length; j++) {            // char배열의 크기만큼 반복
                for (int k = 0; k < arr[i]; k++) {          // 반복횟수만큼 각각의 글자를 stringbuilder에 append함
                    stringBuilder.append(c[j]);
                }
            }
            str[i] = stringBuilder.toString();              // String 배열을 반복된 글자로 교체
            stringBuilder.setLength(0);                     // Stringbuilder 초기화
            System.out.println(str[i]);
        }

    }
}
