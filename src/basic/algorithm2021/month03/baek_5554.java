package basic.algorithm2021.month03;

import java.util.Scanner;

public class baek_5554 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int cnt = 4;
        int total = 0;

        for (int i = 0; i < cnt; i++) {
            total += scan.nextInt();
        }

        if(total < 60 || total > (59 * 60) + 59) {
            throw new Exception("집에 너무 늦게 들어가서 엄마한테 혼났다.");
        }

        System.out.println((total / 60) + "\n" + (total % 60));
        scan.close();
    }
}
