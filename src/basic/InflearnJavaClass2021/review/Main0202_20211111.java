package basic.InflearnJavaClass2021.review;

import java.util.Scanner;

public class Main0202_20211111 {
    private int solution(int n, int[] arr) {
        // 첫 번째 학생은 무조건 보이기 때문에 1로 초기화
        int answer = 1;
        int max = arr[0];

        for(int i = 1; i < n; i++) {
            // 탐색한 학생 중 가장 큰 학생보다 이번 학생이 더 크다면...
            if(max < arr[i]) {
                // counting
                answer++;
                // max값 교체
                max = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(new Main0202_20211111().solution(n, arr));
    }
}
