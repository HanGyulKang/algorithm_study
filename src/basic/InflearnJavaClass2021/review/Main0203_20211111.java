package basic.InflearnJavaClass2021.review;

import java.util.Scanner;

public class Main0203_20211111 {
    private char[] solution(int n, int[][] arr) {
        char[] answer = new char[n];

        // 1 : 가위, 2 : 바위, 3 : 보
        for(int i = 0; i < n; i++) {
            int A = arr[0][i];
            int B = arr[1][i];

            // 같으면 비김
            if(A == B) {
                answer[i] = 'D';
            // 가위와 보가 만났을 경우 작은 수가 이김
            } else if(Math.abs(A - B) == 2) {
                answer[i] = A < B ? 'A' : 'B';
            // 그 외 경우는 모두 큰 수가 이김
            } else {
                answer[i] = A > B ? 'A' : 'B';
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int row = 2;
        int[][] arr = new int[row][n];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for(char x : new Main0203_20211111().solution(n, arr)) {
            System.out.println(x);
        }
    }
}
