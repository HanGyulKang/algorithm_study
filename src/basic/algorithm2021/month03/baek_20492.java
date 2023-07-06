package basic.algorithm2021.month03;

import java.util.Scanner;

public class baek_20492 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int res = (int)(a - (a * 0.22));
        System.out.print(res + " ");
        int res2 = (int)((a * 0.2) * 0.22);
        System.out.println(a - res2);
    }
}
