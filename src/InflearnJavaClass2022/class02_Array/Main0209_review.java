package InflearnJavaClass2022.class02_Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main0209_review {
    private int getMaxNum(ArrayList<Integer> arrList) {
        // 리스트로 받은 숫자들을 Sorting 함
        Collections.sort(arrList);
        // 오름차순으로 정렬되었으니 배열 마지막 index의 값이 가장 큰 수
        return arrList.get(arrList.size() - 1);
    }

    private int solution(int[][] arr, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        int answer = 0;
        // 우 -> 좌 대각선 값을 구하기 위한 j좌표 값 초기 셋팅
        int k = n - 1;
        // 행, 열, 대각선 합계를 담을 변수
        int sum_row, sum_col;
        int sum_RtoL = 0, sum_LtoR = 0;

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
            // 가장 큰 값을 구하기 위해 계산되는 행과 열의 합을 List에 넣음
            arrayList.add(sum_row);
            arrayList.add(sum_col);

        }

        // 대각선 합을 List에 마저 넣음
        arrayList.add(sum_LtoR);
        arrayList.add(sum_RtoL);

        // 만들어둔 가장 큰 값을 찾는 메소드 호출
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
