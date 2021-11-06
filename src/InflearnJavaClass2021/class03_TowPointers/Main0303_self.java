package InflearnJavaClass2021.class03_TowPointers;

import java.util.Scanner;

public class Main0303_self {
    public int solution_TimeLimit(int n, int k, int[] arr) {
        int answer = 0;

        // k의 시작과 끝이 될 pointer 2개
        int p1 = 0;
        int p2 = k;

        while(p2 <= n) {
            int sum = 0;

            for(int i = p1; i < p2; i++) {
                sum += arr[i];
            }
            answer = Math.max(answer, sum);

            p1++;
            p2++;
        }

        return answer;
    }

    // 연속 된 k개의 누적 값 중 최대 누적 값
    public int solution_runtimeErr(int n, int k, int[] arr) {
        int answer = Integer.MIN_VALUE;
        // k개씩 값을 누적시키기 위환 pointer
        int pointer = k;
        int sum = 0;

        for(int i = 0; i < n - 2; i++) {
            for(int j = i; j < pointer; j++) {
                sum += arr[j];
            }
            answer = Math.max(sum, answer);

            // 누적 값 재계산을 위환 초기화
            sum = 0;
            // 다음 k값 누적을 위해 pointer 증가
            pointer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        Main0303_self T = new Main0303_self();
        // 정답은 나오는데... 왤까
        System.out.println(T.solution_runtimeErr(n, k, arr));
        System.out.println(T.solution_TimeLimit(n, k, arr));
    }
}
