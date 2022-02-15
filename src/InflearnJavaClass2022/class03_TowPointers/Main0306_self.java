package InflearnJavaClass2022.class03_TowPointers;

import java.util.Scanner;

public class Main0306_self {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;

        int lt = 0;
        int cnt = 0; // rt가 0을 1로 바꾼 횟수

        // 배열 길이만큼 반복
        for (int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) { // 0을 만나면 1로 바꿈(실제로 바꾸진 않고 cnt++)
                cnt++;

                while(cnt > k) { // 0을 1로 바꾸는 횟수 조건을 넘어서면 lt가 바뀐 1을 다시 0으로 되돌려놓음
                    if(arr[lt] == 0) {
                        cnt--;
                    }

                    lt++;
                }
            }
            // lt와 rt 사이 길이 구하는 식
            int len = rt - lt + 1;
            answer = Math.max(answer, len);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        Main0306_self T = new Main0306_self();
        System.out.println(T.solution(n, k, arr));
    }
}
