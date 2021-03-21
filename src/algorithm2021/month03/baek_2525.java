package algorithm2021.month03;

import java.util.Scanner;

public class baek_2525 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        int time = scan.nextInt();

        m += time;
        if(m >= 60) {
            while(m >= 60) {
                m -= 60;
                h++;
                if(h >= 24) {
                    h = 0;
                }
            }
        }

        System.out.println(h + " " + m);
    }
}
