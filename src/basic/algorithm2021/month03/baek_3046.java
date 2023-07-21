package basic.algorithm2021.month03;

import java.util.Scanner;

public class baek_3046 {
    // (11 + x) / 2 = 10
    // (R1 + R2) / 2 = S
    // (2 * S) - R1
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int R1 = scan.nextInt();
        int S = scan.nextInt();

        System.out.println((2 * S) - R1);
        scan.close();
    }
}
