package algorithm2022.month03;

import java.util.Scanner;

public class Baek_14623 {
    private static int integerToBinary(int n) {
        return Integer.parseInt(Long.toBinaryString(n));
    }

    private static int binaryToInteger(String s) {
        return (int)(Long.parseLong(s, 2));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 2진수로 받은 값을 정수로 추출
        int n = binaryToInteger(scan.next());
        int m = binaryToInteger(scan.next());

        // 추출한 두 정수의 곱을 다시 2진수로 출력
        System.out.println(integerToBinary(n * m));
    }
}
