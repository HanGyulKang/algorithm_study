package basic.algorithm2021.month03;

import java.util.Scanner;

public class baek_2480 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a == b && b == c && a == c) {
            System.out.println(10000 + (a * 1000));
        } else if(a == b) {
            System.out.println(1000 + (a * 100));
        } else if(a == c) {
            System.out.println(1000 + (a * 100));
        } else if(b == c) {
            System.out.println(1000 + (b * 100));
        } else {
            int max = a;
            if(b > max) {
                max = b;
            }
            if(c > max) {
                max = c;
            }
            System.out.println(max * 100);
        }
    }
}
