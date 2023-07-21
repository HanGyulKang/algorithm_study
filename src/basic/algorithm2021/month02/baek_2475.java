package basic.algorithm2021.month02;

import java.util.Scanner;

public class baek_2475 {
    // 각 수의 제곱 mod 10 구하기
    // Math class의 pow함수 사용 법
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) {
            int a = scan.nextInt();
            total += (a * a);
            // total += Math.pow(a, 2); // Math class의 pow함수를 이용해서도 구할 수 있음
            // pow(a , b) : a^b
        }
        System.out.println(total % 10);
    }
}
