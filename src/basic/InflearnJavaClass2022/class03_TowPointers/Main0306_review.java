package basic.InflearnJavaClass2022.class03_TowPointers;

import java.util.Scanner;

public class Main0306_review {
    private int solution(int n, int m, int[] arr) {
        int answer = 0;

        int lt = 0; // 왼쪽 point
        int cnt = 0; // 0을 1로 바꾼 횟수

        // 오른쪽 point가 앞으로 감
        for(int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) { // 앞으로 가던 중 0을 만났다면
                cnt++; // 0을 1로 바꿈

                // cnt가 0을 바꾸는 횟수인 m을 초과하면 lt가 rt을 쫓아가면서 바뀐 1을 다시 0으로 바꿈
                while(cnt > m) {
                    if(arr[lt] == 0) {
                        cnt--; // 바뀐 1을 다시 0으로 바꿈
                    }
                    // rt를 쫓아감
                    lt++;
                }
            }

            // for문이 돌 때마다 길이 계산(최대길이로 answer를 변경)
            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        Main0306_review T = new Main0306_review();
        System.out.println(T.solution(n, m, arr));

    }
}
