package InflearnJavaClass2021.class02_Array;

import java.util.Scanner;

public class Main022_teach {
    // 비교할 방향(위치) 값
    int[] dx = {-1,0,1,0};
    int[] dy = {0,1,0,-1};

    private int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;

                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k]; // 행좌표
                    int ny = j + dy[k]; // 열좌표

                    if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }

                if(flag) {
                    answer++;
                }
            }
        }

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

        Main022_teach T = new Main022_teach();
        System.out.println(T.solution(n, arr));
    }
}
