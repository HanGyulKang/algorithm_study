package InflearnJavaClass2022.class02_Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main0209_review {
    private int getMaxNum(ArrayList<Integer> arrList) {
        Collections.sort(arrList);
        return arrList.get(arrList.size() - 1);
    }

    private int solution(int[][] arr, int n) {
        int answer = 0;
        int k = n - 1;

        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum_row;
        int sum_col;
        int sum_RtoL = 0;
        int sum_LtoR = 0;

        // 행, 열, 대각선 값
        for (int i = 0; i < n; i++) {
            // 좌 -> 우 대각선 값
            sum_LtoR += arr[i][i];
            // 우 -> 좌 대각선 값
            sum_RtoL += arr[i][k--];

            // 각 행 열 계산이 끝날 때 마다 0으로 다시 초기화
            sum_row = 0;
            sum_col = 0;

            for (int j = 0; j < n; j++) {
                // 행
                sum_row += arr[i][j];
                // 열
                sum_col += arr[j][i];
            }
            arrayList.add(sum_row);
            arrayList.add(sum_col);

        }

        arrayList.add(sum_LtoR);
        arrayList.add(sum_RtoL);

        answer = this.getMaxNum(arrayList);

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
