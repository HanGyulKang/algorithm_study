package InflearnJavaClass2021.class02_Array;

import java.util.Scanner;

public class Main024_self {
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= n; i++) { // A학생
            for (int j = 1; j <= n; j++) { // B학생
                int cnt = 0;

                for (int k = 0; k < m; k++) { // 시험회차
                    int A = 0, B = 0;

                    for (int l = 0; l < n; l++) { // 등수
                        // A학생의 등수 입력
                        if(arr[k][l] == i) A = l;
                        // B학생의 등수 입력
                        if(arr[k][l] == j) B = l;
                    }

                    if(A < B) {
                        cnt++;
                    }
                }

                if(cnt == m) { // 시험회차만큼(전체) 모두 앞섰다면...
                    answer++;
                }
            }
        }    

        return answer;
    }

    public static void main(String[] args) {
        Main024_self T = new Main024_self();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println(T.solution(n, m, arr));
    }
}
