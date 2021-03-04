package algorithm2021.month03;

import java.math.BigInteger;
import java.util.Scanner;

public class baek_8437 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();

        System.out.println(a.subtract(b).divide(BigInteger.valueOf(2)).add(b));
        System.out.println(a.subtract(b).divide(BigInteger.valueOf(2)));
    }

}
