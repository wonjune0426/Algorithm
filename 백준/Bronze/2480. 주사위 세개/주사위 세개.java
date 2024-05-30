import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] dice = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < dice.length; i++) {
            dice[i] = sc.nextInt();
        }

        if (dice[0] == dice[1] && dice[0] == dice[2]) {
            System.out.println(10000 + dice[0] * 1000);
        } else if (dice[0] == dice[1] || dice[0] == dice[2]) {
            System.out.println(1000 + dice[0] * 100);
        } else if (dice[1] == dice[2]) {
            System.out.println(1000 + dice[1] * 100);
        } else {
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