package basic.InflearnJavaClass2021.review;

import java.util.Scanner;

public class Main0207_20211118 {
    private int solution(int n, int[] arr) {
        int answer = 0;
        int score = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                // 연속된 1이 들어올 경우 전위증감연산자로 ++ 값을 누적
                answer += ++score;
            } else {
                // 중간에 0이 들어올 경우 다시 0으로 초기화
                score = 0;
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

        Main0207_20211118 T = new Main0207_20211118();
        System.out.println(T.solution(n, arr));
    }
}
