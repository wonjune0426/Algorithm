package com.example.week1.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Number4_Main {
    public static void main(String[] args) throws IOException {

        //단어 입력을 받기 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 대소문자 구분 X, 출력 문자 대문자 이기때문에 전부 대문자로 변환
        String s = br.readLine().toUpperCase();
        br.close();

        // 각각의 글자를을 char[]로 저장
        char[] chars = s.toCharArray();

        // 글자와 반복갯수를 저장하기 위한 hashmap
        HashMap<Character, Integer> map = new HashMap<>();

        // 제일 많이 반복된 글자와 빈도 수 저장을 위한 변수
        char maxChar = '?';
        int maxNum = 0;

        // map에서 각 글자마다 빈도수를 저장
        // 기존에 있는 글자일 경우 value +1
        for(char c : chars) {
            if (map.containsKey(c)) {
                map.put(c,map.get(c)+1);
            } else{
                map.put(c,1);
            }

            // 최대 빈도수 글자와 빈도 저장
            if(map.get(c) > maxNum){
                maxNum = map.get(c);
                maxChar = c;
            }
        }

        // 빈도수 비교를 위해 최대 빈도수 글자 제거
        map.remove(maxChar);

        // 제거 했던 빈도수와 같은 빈도의 글자가 있다면 '?'로 변환
        for(Integer i : map.values()){
            if(maxNum == i){
                maxChar = '?';
            }
        }

        System.out.println(maxChar);

    }
}
