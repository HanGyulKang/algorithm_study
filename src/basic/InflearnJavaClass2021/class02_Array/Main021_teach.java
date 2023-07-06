package basic.InflearnJavaClass2021.class02_Array;

import java.util.Scanner;

public class Main021_teach {
    private int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;

        int sum1, sum2; // 행의 합, 열의 합
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;

            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j]; // 행
                sum2 += arr[j][i]; // 열
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i]; // 왼쪽 -> 오른쪽 하향 대각선
            sum2 += arr[i][n - i - 1]; // 오른쪽 -> 왼쪽 하향 대각선
        }

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main021_teach T = new Main021_teach();

        int n = scan.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));
    }
}
