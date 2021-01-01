package algorithm2021.month01;

import java.util.Scanner;

public class baek_1978 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int res = 0;

        for (int i = 0; i < N; i++) {
            int num = scan.nextInt();
            int cnt = 0;

            for (int j = 1; j <= num; j++) {
                if(num % j == 0) {
                    cnt++;
                }
            }

            if(cnt == 2) {
                res++;
            }
        }
        System.out.println(res);
    }
}
