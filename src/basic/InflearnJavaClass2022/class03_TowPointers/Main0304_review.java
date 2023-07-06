package basic.InflearnJavaClass2022.class03_TowPointers;

import java.util.Scanner;

public class Main0304_review {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;

        int lt = 0;
        int rt = 0;

        while(rt < n) {
            if(sum <= m) { // m 이하일 경우 rt값을 먼저 증가시키면서 값 누적
                sum += arr[rt++];
            } else if(sum > m) { // m을 초과할 경우 lt가 rt를 따라가며 누적된 값 제거
                sum -= arr[lt++];
            }

            if(sum == m) { // 위 로직 실행 중 누적 값이 목표치인 m과 같을 경우 카운팅
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        Main0304_review T = new Main0304_review();
        System.out.println(T.solution(n, m, arr));
    }
}
