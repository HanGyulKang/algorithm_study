package basic.algorithm2021.month07;

import java.util.Scanner;

public class baek_16486 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A = scan.nextInt();
        double B = scan.nextInt();

        double res = (A * 2) + (2 * 3.141592 * B);
        System.out.println(res);
    }
}
