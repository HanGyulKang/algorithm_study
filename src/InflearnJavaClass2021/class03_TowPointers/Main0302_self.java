package InflearnJavaClass2021.class03_TowPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main0302_self {
    private ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 각 배열의 Pointer
        int p1 = 0;
        int p2 = 0;

        // Pointer를 사용하기 위해 오름차순 정렬
        Arrays.sort(a);
        Arrays.sort(b);

        while(p1 < n && p2 < m) {
            if(a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            // 강의 들은 후 조건 추가...
            // a배열 탐색
            } else if(a[p1] < b[p2]) {
                p1++;
            // b배열 탐색
            } else {
                p2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr_A = new int[n];
        for (int i = 0; i < n; i++) {
            arr_A[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int[] arr_B = new int[m];
        for (int i = 0; i < m; i++) {
            arr_B[i] = scan.nextInt();
        }

        Main0302_self T = new Main0302_self();
        for(int x : T.solution(n, m, arr_A, arr_B)) {
            System.out.print(x + " ");
        }

    }
}
