package basic.algorithm2021.month04;

import java.util.Scanner;

public class baek_10156 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int res = (a * b) - c <= 0 ? 0 : (a * b) - c;
        System.out.println(res);
    }
}
