package com.example.week1.day2;

import java.util.Scanner;

public class Number2_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 입력을 받기위한 Scanner
        int[] arr = new int[4];               // 카드의 합을 저정하기 위한 배열
        String result = "NO";                 // 출력할 문자열

        int N = sc.nextInt();                 // 카드의 총 갯수 입력 받음

        String[] card = new String[N];        // 카드 이름을 입력 받기 위한 배열
        int[] cardCount = new int[N];         // 각 카드의 숫자를 입력 받기 위한 배열

        for (int i = 0; i < N; i++) {         // 카드와 갯수를 저장
            card[i] = sc.next();
            cardCount[i] =sc.nextInt();
        }

        for(int i=0;i<card.length;i++){       // 입력 받은 카드들을 반복하면서 숫자를 저장
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

        for(int s: arr){                        // 카드의 숫자를 합친 배열을 반복
            if (s == 5) {                       // 카드의 숫자 합이 5인 경우 반복문 빠져나옴
                result = "YES";
                break;
            }
        }

        System.out.println(result);

    }
}
