package algorithm2021.month05;

import java.util.Scanner;

public class baek_10162 {
    private static String getCnt(int T) {
        int a = 0, b = 0, c = 0;

        while(T >= 10){
            if(T >= 300) {
                T -= 300;
                a++;
            } else if(T >= 60) {
                T -= 60;
                b++;
            } else if(T >= 10) {
                T -= 10;
                c++;
            }
        }

        return T % 10 > 0 ? "-1" : a + " " + b + " " + c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        System.out.println(getCnt(T));
    }

}
