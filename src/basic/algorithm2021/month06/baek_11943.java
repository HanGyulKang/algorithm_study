package basic.algorithm2021.month06;

import java.util.Scanner;

public class baek_11943 {
    /**
     * https://velog.io/@gang6607/백준-11943-파일-옮기기
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /** [A 그룹] */
        int A = scan.nextInt();
        int B = scan.nextInt();
        /** [B 그룹] */
        int C = scan.nextInt();
        int D = scan.nextInt();

        // 경우의 수는 두 개 뿐이다
        // 1. A그룹의 사과 옮기기 + B그룹의 오렌지 옮기기 = (A + D)
        // 2. A그룹의 오렌지 옮기기 + B그룹의 사과 옮기기 = (B + C)
        // 즉 두 경우의 수 중 최소값이 답이다.
        int res = Math.min(A + D, B + C);
        System.out.println(res);
    }
}
