package com.example.week1.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number5_Main {
    public static void main(String[] args) throws IOException {
        // 입력 받을 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 점수의 총 갯수
        int count = Integer.parseInt(br.readLine());
        // 각각의 점수들을 String 배열에 저장
        String[] scores = br.readLine().split(" ");
        br.close();

        // 최대 값과 점수의 합ㅇ을 저장하기 위한 변수
        // 초기에는 int로 접근 했으나 실패 double로 변경
        double maxNum = 0;
        double sumScore = 0;

        // 각각의 점수들을 int로 담기 위한 배열
        int[] arrScores = new int[scores.length];

        // 각각의 점수들을 int로 형변환하여 배열에 담음
        // 반복문을 돌면서 최대값과 각 점수들의 합을 구함
        for (int i = 0; i < scores.length; i++) {
            arrScores[i] = Integer.parseInt(scores[i]);
            if (arrScores[i] > maxNum) {
                maxNum = arrScores[i];
            }
            sumScore += arrScores[i];
        }


        System.out.println((sumScore / count) / maxNum * 100);


    }
}
