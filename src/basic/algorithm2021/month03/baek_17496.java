package basic.algorithm2021.month03;

import java.util.Scanner;

public class baek_17496 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int summer = scan.nextInt();
        int day = scan.nextInt();
        int cnt = scan.nextInt();
        int price = scan.nextInt();

        int res = 1;
        int resPrice = 0;

        do {
            res += day;
            if(summer < res) {
                break;
            }
            resPrice += cnt * price;
        } while(true);

        System.out.println(resPrice);
    }
}
