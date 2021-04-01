package algorithm2021.month03;

import java.util.Scanner;

public class baek_10101 {
    public static String chk(int a, int b, int c) {
        if(a == 60 && b == 60 && c == 60) {
            return "Equilateral";
        }

        int sum = a + b + c;
        if(sum == 180) {
            if(a == b || b == c || a == c) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        } else {
            return "Error";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(chk(a,b,c));

    }
}
