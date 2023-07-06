package basic.InflearnJavaClass2021.class02_Array;

import java.util.Scanner;

public class Main022_self {
    public int solution(int[][] arr, int n) {
        int answer = 0;
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if(arr[i][j] > arr[i-1][j] && arr[i][j] > arr[i][j-1] && arr[i][j] > arr[i+1][j] && arr[i][j] > arr[i][j+1]) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        n += 2;

        int[][] arr = new int[n][n];

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        Main022_self T = new Main022_self();
        System.out.println(T.solution(arr,n));
    }
}
