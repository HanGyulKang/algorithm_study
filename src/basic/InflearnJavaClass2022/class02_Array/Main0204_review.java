package basic.InflearnJavaClass2022.class02_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main0204_review {
    private ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 피보나치 수열 : 처음 두 숫자는 무조건 1로 초기화
        answer.add(1);
        answer.add(1);

        for (int i = 2; i < n; i++) {
            int k = answer.get(i - 2) + answer.get(i - 1);
            answer.add(k);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Main0204_review T = new Main0204_review();
        for (int x : T.solution(n)) {
            System.out.print(x + " ");
        }
    }
}
