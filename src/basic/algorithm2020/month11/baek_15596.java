package basic.algorithm2020.month11;

import java.util.Scanner;

public class baek_15596 {

    static long sum(int[] a) {
        int total = 0;

        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 10;

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        System.out.println(sum(a));
    }
}
