package basic.algorithm2021.month03;

import java.util.Scanner;

public class baek_2752 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int max = a;
        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }

        int min = a;
        if(b < min) {
            min = b;
        }
        if(c < min) {
            min = c;
        }
        System.out.print(min + " " + ((a + b + c) - max - min) + " " +  max);
    }
}
