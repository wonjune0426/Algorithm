package com.example.week1.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number7_Main {
    public static void main(String[] args) throws IOException {
        /*
            Google 검색, 멘토링, 팀원 조언 참고해서 해결

            TreeMap = 객체를 저장 시 Key값으로 자동으로 정렬됨 (오름차순)
            내림차순 정렬으로 변경시 descendingMap() 메서드를 사용 returnType = NavigableMap

            [map객체].getOrDefaults(key, [defaultValue]
             map에서 key값으로 value가 존재하면 해당 value값
             map에서 key값으로 value가 존재하지 않으면 [defaultValue]

         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String,Integer> strings = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String s =br.readLine().split("\\.")[1];
            strings.put(s, strings.getOrDefault(s, 0) + 1);
        }

        for (String key : strings.keySet()) {
            System.out.println(key+" "+strings.get(key));
        }

    }
}
