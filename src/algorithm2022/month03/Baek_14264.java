package algorithm2022.month03;

import java.util.Scanner;

public class Baek_14264 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double answer;

        // 공식
        answer = (Math.sqrt(3) / 4) * Math.pow(n, 2);
        System.out.println(answer);
    }
}
