package com.example.week1.day2;

import java.util.Scanner;

public class Number1_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);              // 입력을 받기위한 스캐너
        String s = sc.nextLine().trim();                  // 문장을 읽어옴 trim()을 사용해 앞뒤 공백 제거
        sc.close();

        if(s.isEmpty()){                                   // " "다음과 같이 공백만 들어오는 경우를 대비
            System.out.println(0);
        } else{
            System.out.println(s.split(" ").length); // 공백만 있는게 아닐 경우
        }                                                  // split(" ")을통해 문자열 배열로 변환 길이 출력
    }
}
