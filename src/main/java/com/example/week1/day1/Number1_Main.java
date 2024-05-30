package com.example.week1.day1;

import java.util.Scanner;

public class Number1_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // 키보드 입력을 받기 위한 Scanner
        int n = sc.nextInt();                       // 별 높이를 입력 받음
        sc.close();

        for (int i = 1; i <= n; i++) {              // 높이를 순회 하는 반복문
            for (int j = 1; j <= i; j++) {          // 각 높이 마다 행을 찍기 위한 반목문
                System.out.print("*");
            }
            System.out.println();                   // 각 높이 마다 줄바꿈
        }
    }
}