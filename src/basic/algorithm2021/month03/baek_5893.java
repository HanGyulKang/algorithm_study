package basic.algorithm2021.month03;

import java.util.Scanner;

public class baek_5893 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String getStr = scan.next();

        StringBuffer sb = new StringBuffer();
        sb.append(getStr).reverse();
        String str = sb.toString();

        int num = 1;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i) - '0') == 1) {
                sum += num;
            }
            num *= 2;
        }
        System.out.println(Integer.toBinaryString(sum * 17));
    }
}
