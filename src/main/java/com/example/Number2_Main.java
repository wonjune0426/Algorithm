package com.example;

import java.util.Scanner;

public class Number2_Main {
    public static void main(String[] args) {

        int[] dice = new int[3];                                // 각각의 주사위 눈금을 저장하기 위한 배열
        Scanner sc = new Scanner(System.in);                    // 입력을 위한 Scanner

        for (int i = 0; i < dice.length; i++) {                 // 주사위 눈금을 입력 받음
            dice[i] = sc.nextInt();
        }
        sc.close();

        if (dice[0] == dice[1] && dice[0] == dice[2]) {        // 첫 번째 조건문 3가지의 눈금이 모두 같은 경우
            System.out.println(10000 + dice[0] * 1000);
        } else if (dice[0] == dice[1] || dice[0] == dice[2]) { // 두 개의 눈금이 같을 경우 (1-2) or (1-3)
            System.out.println(1000 + dice[0] * 100);
        } else if (dice[1] == dice[2]) {                       // 두 개의 눈금이 같을 경우 (1-3)
            System.out.println(1000 + dice[1] * 100);
        } else {                                               // 3개의 주사위 눈금이 모두 다를 경우 최대값을 구하기 위한 조건문
            if (dice[0] > dice[1] && dice[0] > dice[2]) {
                System.out.println(dice[0] * 100);
            } else if (dice[1] > dice[2]) {
                System.out.println(dice[1] * 100);
            } else {
                System.out.println(dice[2] * 100);
            }
        }
    }

}
