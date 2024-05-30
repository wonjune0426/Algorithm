package com.example.week1.day1;

import java.util.Scanner;

public class Number5_Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputMonth = scanner.nextInt();
        int inputDay = scanner.nextInt();
        scanner.close();

        int maxDay;
        String[] days = {"SUN","MON", "TUE", "WED", "THU", "FRI", "SAT"};

        switch (inputMonth) {
            case 1, 3, 5, 7, 8, 10, 12:
                maxDay = 31;
                break;
            case 4, 6, 9, 11:
                maxDay = 30;
                break;
            case 2:
                maxDay = 28;
                break;
        }
    }
}
