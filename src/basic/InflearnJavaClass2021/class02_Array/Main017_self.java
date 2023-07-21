package basic.InflearnJavaClass2021.class02_Array;

import java.util.Scanner;

public class Main017_self {
    private int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    cnt++;
                }
            }

            if(cnt == 2) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main017_self T = new Main017_self();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        System.out.println(T.solution(n));
    }
}
