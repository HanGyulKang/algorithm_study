package algorithm2021.month05;

import java.util.Scanner;

public class baek_10162 {
    private static int getCnt(int T) {
        if(T % 10 != 0) {
            return -1;
        }

        int A = 300; // 5분
        int B = 60;
        int C = 10;

        int cnt = 0;
        int modNum = 0;




        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        System.out.println(getCnt(T));
    }

}
