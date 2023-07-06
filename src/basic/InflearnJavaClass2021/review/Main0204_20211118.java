package basic.InflearnJavaClass2021.review;

import java.util.Scanner;

public class Main0204_20211118 {
    private int[] solution_02(int n) {
        int[] answer = new int[n];

        int temp = 0;
        int num = 1;

        for(int i = 0; i < n; i++) {
            temp = temp + num;
            num = temp - num;
            answer[i] = temp;
        }

        return answer;
    }

    private int[] solution(int n) {
        int[] answer = new int[n];

        answer[0] = 1;
        answer[1] = 1;

        for(int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Main0204_20211118 T = new Main0204_20211118();

        for(int x : T.solution(n)) {
            System.out.print(x + " ");
        }

        for(int x : T.solution_02(n)) {
            System.out.print(x + " ");
        }
    }
}
