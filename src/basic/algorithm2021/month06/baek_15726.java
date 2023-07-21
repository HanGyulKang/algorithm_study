package basic.algorithm2021.month06;

import java.util.Scanner;

public class baek_15726 {
    /**
     * https://velog.io/@gang6607/백준-15726-이칙연산-qaafnl61
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 입력값에 소수점이 있기 때문에 double로 받는다.
        double a = scan.nextInt();
        double b = scan.nextInt();
        double c = scan.nextInt();

        // 출력 시 소수점 아래는 버리기 때문에 Integer로 캐스팅 해서 소수점 아래는 버린다.
        System.out.println(Math.max((int)(a * b / c), (int)(a / b * c)));
    }
}
