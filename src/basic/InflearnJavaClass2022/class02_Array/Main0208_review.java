package basic.InflearnJavaClass2022.class02_Array;

import java.util.Scanner;

public class Main0208_review {
    private int[] solution(int n , int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            // 일단 1등으로 초기화
            answer[i] = 1;
            for (int j = 0; j < n; j++) {
                if(arr[i] < arr[j]) {
                    // 들어온 점수와 전체 점수들을 비교 (들어온 점수가 낮으면 등수++)
                    answer[i]++;
                }
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

        Main0208_review T = new Main0208_review();
        for(int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }

    }
}
