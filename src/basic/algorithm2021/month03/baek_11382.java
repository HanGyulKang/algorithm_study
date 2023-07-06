package basic.algorithm2021.month03;

import java.math.BigInteger;
import java.util.Scanner;

public class baek_11382 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        BigInteger c = scan.nextBigInteger();
        System.out.println(a.add(b).add(c));
    }
}
