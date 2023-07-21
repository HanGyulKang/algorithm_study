package basic.algorithm2020.month11;

import java.util.Scanner;

public class baek_5543 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int BUGGER = 3;
        int BEVERAGE = 2;
        int[] buggerMenu = new int[BUGGER];
        int[] beverageMenu = new int[BEVERAGE];
        int cheapBugger = 0;
        int cheapBeverage = 0;

        int min = 2000;
        for (int i = 0; i < buggerMenu.length; i++) {
            buggerMenu[i] = scan.nextInt();
            if(min > buggerMenu[i]) {
                min = buggerMenu[i];
            }
        }
        // 가장 저렴한 햄버거
        cheapBugger = min;

        min = 2000;
        for (int i = 0; i < beverageMenu.length; i++) {
            beverageMenu[i] = scan.nextInt();
            if(min > beverageMenu[i]) {
                min = beverageMenu[i];
            }
        }
        // 가장 저렴한 음료
        cheapBeverage = min;

        // 가장 저렴한 셋트(세트효과 : 50원 할인)
        System.out.println((cheapBugger + cheapBeverage) - 50);
    }
}
