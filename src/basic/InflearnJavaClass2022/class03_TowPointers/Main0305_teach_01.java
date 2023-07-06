package basic.InflearnJavaClass2022.class03_TowPointers;

import java.util.Scanner;

public class Main0305_teach_01 {
    public static int solution(int n) {
        int answer = 0;
        int cnt = 1;

        n--;

        while(n > 0) {
            cnt++;
            n = n - cnt; // cnt : 연속된 자연수의 개수

            if(n % cnt == 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(solution(n));
    }
}
