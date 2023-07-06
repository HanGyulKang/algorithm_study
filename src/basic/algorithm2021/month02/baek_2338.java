package basic.algorithm2021.month02;

import java.math.BigInteger;
import java.util.Scanner;

public class baek_2338 {
    // A + B, A - B, A * B 출력
    // BigInteger 연습
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
    }
}
