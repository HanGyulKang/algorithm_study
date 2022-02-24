package InflearnJavaClass2022.class02_Array;

import java.util.Scanner;

public class Main0202_review {
    public int solution(int n, int[] arr) {
        // 맨 앞의 학생은 무조건 보이기 때문에 1로 초기화
        int answer = 1;
        // 탐색하는 중 가장 큰 학생 키 저장 (우선 맨 앞 학생의 키로 초기화)
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            // 1. 들어온 학생이 이제까지 탐색한 학생들 중 가장 키가 큰 학생보다 키카 더 큰지 체크
            if(arr[i] > max) {
                answer++;
            }

            // 2. 들어온 학생과 가장 키가 큰 학생의 키 중 max값을 저장
            max = Math.max(max, arr[i]);
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
