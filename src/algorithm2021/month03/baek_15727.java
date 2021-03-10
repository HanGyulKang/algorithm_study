package algorithm2021.month03;

import java.util.Scanner;

public class baek_15727 {
    final static int MOVE = 5;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int distance = scan.nextInt();
        System.out.println(distance % MOVE == 0 ? distance / MOVE : distance / MOVE + 1);
    }
}
