package com.example;

import java.util.Scanner;

public class Number4_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            // 입력을 받기위한 Scanner
        int num = sc.nextInt();
                                                        // 3이라고 가정
        for (int i = 1; i <= num; i++) {                // 별찍기의 상단 부분 중간 까지 채우기 위해 num까지 반복
            printStar(num, i);                          //  *    *
        }                                               //  **  **
                                                        //  ******

        for(int i = num-1; i >= 1; i--){                // 별찍기의 하단 부분 중간 부분을 제외한 밑 부분 num-1까지 반복
            printStar(num, i);                          //  **  **
        }                                               //  *    *
    }

    private static void printStar(int num, int i) {     // 별을 찍기 위한 method (intellij가 분리 해줌)
        for(int j = 1; j <= num*2; j++){                // 1부터 시작해서 2배 범위까지 반복
            if(j<=i || j>num*2-i){                      // 별을 찍는 경우의 조건문
                System.out.print("*");
            } else{                                     // 공백을 찍는 조건문
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
