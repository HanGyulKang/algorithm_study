package algorithm2021.month06;

import java.io.*;
import java.util.Scanner;

public class baek_10707 {
    public static void main(String[] args) throws IOException {
        // 입력 받을 Scanner 선언
        Scanner scan = new Scanner(System.in);

        /** X사에 대한 내용 */
        int A = scan.nextInt(); // X사의 1리터당 요금 A
        /** Y사에 대한 내용 */
        int B = scan.nextInt(); // Y사의 기본요금 B
        int C = scan.nextInt(); // Y사의 요금이 기본요금이 되는 사용량의 상한 C
        int D = scan.nextInt(); // Y사의 1리터 당 추가요금 D

        /** 요금의 근간이 되는 사용량 */
        int P = scan.nextInt(); // JOI군의 집에서 사용하는 한 달간 수도의 양 P

        // [Y사의 금액 계산]
        //  1. 상한을 넘어선 값(사용량 - 상한) 만큼 반복문을 실행합니다.
        //  2. P - C가 0보다 작다면 조건절에 0이 들어가 반복문이 실행되지 않게 Math클래스의 max함수를 사용합니다.
        //  3. 반복 시 Y사의 추가요금을 기본요금에 누적합니다.
        for (int i = 0; i < (Math.max(P - C, 0)) ; i++) {
            B += D;
        }

        // [X사의 금액] = (1리터당 요금 * 사용량) = (A * P)
        // X와 Y사의 요금 중 저렴한 요금을 출력합니다.
        System.out.println(Math.min((A * P), B));
    }
}
