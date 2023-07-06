package basic.algorithm2021.month03;

import java.util.Scanner;

public class baek_2420 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        long b = scan.nextInt();
        long res = 0;

        if(a < 0) {
            res = Math.abs(a) + b;
        } else if (b < 0) {
            res = a + Math.abs(b);
        } else if (a < 0 && b < 0) {
            res = Math.abs(a) + Math.abs(b);
        } else {
            res = a - b;
        }
        System.out.println(Math.abs(res));
    }
}
