package basic.algorithm2021.month06;

import java.util.Scanner;

public class baek_15873 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int res = 0;

        System.out.println(109 / 10);

        if(a / 10 < 10) {
            res = (a / 10) + (a % 10);
        } else if(a / 10 == 10) {
            res = (a / 10) + (a % 10);
        } else {
            res = 20;
        }

        System.out.println(res);
    }
}
