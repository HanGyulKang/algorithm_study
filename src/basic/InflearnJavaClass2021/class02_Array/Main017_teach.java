package basic.InflearnJavaClass2021.class02_Array;

import java.util.Scanner;

public class Main017_teach {
    // 에라토스테네스 체
    private int solution(int n) {
        int answer = 0;

        int[] chk = new int[n + 1];
        for(int i = 2; i < n; i++) {
            if(chk[i] == 0) {
                answer++;
                for(int j = i; j < n; j = j + i) {
                    chk[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Main017_teach T = new Main017_teach();
        System.out.println(T.solution(n));
    }
}
