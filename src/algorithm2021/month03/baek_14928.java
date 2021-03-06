package algorithm2021.month03;

import java.io.IOException;
import java.util.Scanner;

public class baek_14928 {
    final static int NUM = 20000303;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int a = 0;

        for(int i = 0; i < str.length(); i++){
            int num = str.charAt(i)-'0';
            a *= 10;
            a += num;
            a %= NUM;
            System.out.println(num + " / " + a);

        }
        System.out.println(a);
    }
}
