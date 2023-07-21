package basic.algorithm2021.month05;

import java.util.Scanner;

public class baek_10179 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double SALE_PRICE = 0.8;
        double res = 0.0;

        int cnt = scan.nextInt();

        for (int i = 0; i < cnt; i++) {
            res = scan.nextDouble() * SALE_PRICE;
            System.out.println("$" + String.format("%.2f", res));
        }
    }
}
