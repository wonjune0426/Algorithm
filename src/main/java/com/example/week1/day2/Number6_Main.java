package com.example.week1.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Number6_Main {
    public static void main(String[] args) throws IOException {

        // 출근 중인 사람의 명단을 구하는 것 까지는 시도했으나
        // 사전 역순으로 정렬 하는 부분이 막혀 참고

        // 입력을 받기 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출입 기록 갯수 입력받아 저장
        int count = Integer.parseInt(br.readLine());
        // 이름, 현재상태를 저장하기 위한 map 객체
        HashMap<String, String> map = new HashMap<>();
        // enter상태의 직원들을 저장하기 위한 List
        ArrayList<String> enterMember = new ArrayList<>();


        // 출입 기록 수 만큼 입력 받아 map에 저장
        for (int i = 0; i < count; i++) {
            String s = br.readLine();
            map.put(s.split(" ")[0], s.split(" ")[1]);
        }
        br.close();

        // 현재 회사에 있는 상태인 직원의 명단을 List에 담음
        for (String key : map.keySet()) {
            if (map.get(key).equals("enter")) {
                enterMember.add(key);
            }
        }

        // 참고한 내용
        // 역순으로 정렬
        Collections.sort(enterMember);
        Collections.reverse(enterMember);

        for (String s : enterMember) {
            System.out.println(s);
        }

    }
}
