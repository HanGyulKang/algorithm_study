package basic.algorithm2020.month11;

import java.util.Scanner;

public class beak_10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(str.indexOf(c) + " ");
        }
        scan.close();
    }
}
