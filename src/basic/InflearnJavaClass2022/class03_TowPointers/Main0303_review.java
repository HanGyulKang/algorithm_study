package basic.InflearnJavaClass2022.class03_TowPointers;

import java.util.Scanner;

public class Main0303_review {
    public int solution(int n, int k, int[] arr) {
        int answer;
        int sum = 0;

        // 연속 된 길이 조건 k만큼 일단 sum에 더함(최초 값으로 초기화)
        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;

        // 첫 조건 값으로 초기화 된 이후 값들을 게산
        // 다음 index값은 더하고, 처음 index값은 빼면서 한 칸씩 전진
        // 1 2 3 4 5 6 7 8 9 10
        // 1 - (1 + 2 + 3) + 4
        // 2 - (2 + 3 + 4) + 5... 예를 들면 이런 식으로 전진
        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            // 최대값 비교
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main0303_review T = new Main0303_review();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // 장사 일 수
        int k = scan.nextInt(); // 연속된 일 수 조건
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(n, k, arr));

    }
}
