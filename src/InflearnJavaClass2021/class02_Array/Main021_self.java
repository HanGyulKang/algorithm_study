package InflearnJavaClass2021.class02_Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main021_self {
    public int solution(int[][] arr, int n) {
        int answer = 0;
        int tmp_row = 0;
        int tmp_col = 0;
        int tmp_left_diag = 0;
        int tmp_right_diag = 0;

        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tmp_row += arr[i][j];
                tmp_col += arr[j][i];
            }
            // 왼쪽 -> 오른쪽 하향 대각선
            tmp_left_diag += arr[i][i];
            // 오른쪽 -> 왼쪽 하향 대각선
            tmp_right_diag += arr[i][n - 1 - i];

            arrList.add(tmp_row);
            arrList.add(tmp_col);
            tmp_row = 0;
            tmp_col = 0;
        }

        arrList.add(tmp_left_diag);
        arrList.add(tmp_right_diag);

        Collections.sort(arrList);
        answer = arrList.get(arrList.size() - 1);

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                   arr[i][j] = scan.nextInt();
            }
        }

        Main021_self T = new Main021_self();
        System.out.println(T.solution(arr, n));
    }
}
