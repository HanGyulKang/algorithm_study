package basic.algorithm2021.month03;

import java.util.Scanner;

public class baek_4299 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = scan.nextInt();
        int diff = scan.nextInt();

        if(sum - diff < 0) {
            System.out.println(-1);
        } else {
            if((sum - diff) % 2 == 0) {
                System.out.println((sum - diff) / 2 + diff + " " + (sum - diff) / 2);
            } else {
                System.out.println(-1);
            }
        }
        scan.close();
    }
}
