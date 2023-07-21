package basic.algorithm2021.month02;

import java.util.Scanner;

public class baek_1550 {
    // 16진수 -> 10진수 변환
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        // parseInt() 함수로 16진수 출력
        System.out.println(Integer.parseInt(str, 16));
    }
}
