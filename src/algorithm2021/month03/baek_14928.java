package algorithm2021.month03;

import java.math.BigInteger;
import java.util.Scanner;

public class baek_14928 {
    final static int NUM = 20000303;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        System.out.println(a.mod(BigInteger.valueOf(NUM)));
    }
}
