package basic.InflearnJavaClass2022.class02_Array;

import java.util.Scanner;

public class Main0202_review {
    public int solution(int n, int[] arr) {
        // 맨 앞의 학생은 무조건 보임
        int answer = 1;
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            // 기존의 가장 키가 컸던 학생보다 이번 학생 키가 더 크다면
            if(arr[i] > max) {
                // 카운팅
                answer++;
                // max값 변경
                max = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        Main0202_review T = new Main0202_review();
        System.out.println(T.solution(n, arr));
    }
}
