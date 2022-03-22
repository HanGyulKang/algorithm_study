package InflearnJavaClass2022.class02_Array;

import java.util.Scanner;

public class Main0209_review {
    private int solution(int[][] arr, int n) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        int k = n - 1;
        int sum_row = 0;
        int sum_col = 0;

        for (int i = 0; i < n; i++) {
            // 좌 -> 우 대각선 값
            max += arr[i][i];
            // 우 -> 좌 대각선 값
            sum_row += arr[i][k--];
        }

        // 각 대각선의 합 중 가장 큰 값
        max = Math.max(max, sum_row);

        // 행, 열 값
        for (int i = 0; i < n; i++) {
            // 각 행 열 계산이 끝날 때 마다 0으로 다시 초기화
            sum_row = 0;
            sum_col = 0;

            for (int j = 0; j < n; j++) {
                // 행
                sum_row += arr[i][j];
                // 열
                sum_col += arr[j][i];
            }
            sum_row = Math.max(sum_row, sum_col);
        }

        max = Math.max(sum_row, max);

        answer = max;
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        Main0209_review T = new Main0209_review();
        System.out.println(T.solution(arr, n));
    }
}
