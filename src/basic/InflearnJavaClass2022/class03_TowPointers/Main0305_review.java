package basic.InflearnJavaClass2022.class03_TowPointers;

import java.util.Scanner;

public class Main0305_review {
    private int solution(int n, int[] arr) {
        int answer = 0;

        int sum = 0; // 누적 값 체크
        int lt = 0; // 왼쪽 point
        int m = n / 2 + 1; // 목표값의 절반 + 1 값을 넘어가는 것은 의미가 없음

        // lt보다 먼저 앞쪽을 탐색할 오른쪽 point
        for(int rt = 0; rt < m; rt++) {
            // 값을 누적
            sum += arr[rt];

            // 목표치에 왔다면 counting
            if(sum == n) {
                answer++;
            }

            // 누적 값이 목표값 n 이상이 된다면 lt가 쫓아오며 기존에 더한 값을 빼줌
            while(sum >= n) {
                sum -= arr[lt++];

                // 빼던 도중 목표값에 도달한다면 다시 counting
                if(sum == n) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        Main0305_review T = new Main0305_review();
        System.out.println(T.solution(n, arr));
    }
}
