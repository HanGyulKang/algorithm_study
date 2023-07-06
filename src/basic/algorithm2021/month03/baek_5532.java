package basic.algorithm2021.month03;

import java.util.Scanner;

public class baek_5532 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();

        int koreanish = A % C > 0 ? (A / C) + 1 : A / C;
        int math = B % D > 0 ? (B / D) + 1 : B / D;
        System.out.println(L - (koreanish > math ? koreanish : math));
    }
}
