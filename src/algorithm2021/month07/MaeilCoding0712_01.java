package algorithm2021.month07;

import java.util.Scanner;

public class MaeilCoding0712_01 {

    private static float process(int N) {
        float res = 0;

        for (int i = 1; i <= N; i++) {
            res += 1.0 / i;
        }

        return res;
    }

    public static void main(String[] args) {
        /**
         * N을 입력받은 후 1 + 1/2 + 1/3 +... + 1/N의 값을 출력하세요.
         */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        System.out.println(process(N));
    }
}
