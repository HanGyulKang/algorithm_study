package basic.algorithm2021.month02;

import java.math.BigInteger;
import java.util.Scanner;

public class baek_1271 {
    // 엄청난 부자 : BigInteger
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();

        System.out.println(a.divide(b));
        System.out.println(a.mod(b));
    }
}
