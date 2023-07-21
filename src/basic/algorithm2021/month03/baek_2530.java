package basic.algorithm2021.month03;

import java.util.Scanner;

public class baek_2530 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        int s = scan.nextInt();
        int time = scan.nextInt();

        s += time;
        if(s > 59) {
            while(s > 59) {
                s -= 60;
                m++;
                if(m > 59) {
                    m -= 60;
                    h++;
                    if(h > 23) {
                        h = 0;
                    }
                }
            }
        }
        System.out.println(h + " " + m + " " + s);
    }
}
