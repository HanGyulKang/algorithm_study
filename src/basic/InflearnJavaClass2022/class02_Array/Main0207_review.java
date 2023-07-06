package basic.InflearnJavaClass2022.class02_Array;

import java.util.Scanner;

public class Main0207_review {
    private int solution(int n, int[] arr) {
        int answer = 0;
        // 점수 누적 값을 계산할 변수
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                // 중간에 0이 나오면 초기화
                sum = 0;
            } else {
                // 0이 아니면 전위연산자로 계속 증가시키는 sum을 answer에 누적
                answer += ++sum;
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

        Main0207_review T = new Main0207_review();
        System.out.println(T.solution(n, arr));
    }
}
