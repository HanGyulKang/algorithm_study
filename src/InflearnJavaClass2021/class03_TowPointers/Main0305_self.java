package InflearnJavaClass2021.class03_TowPointers;

import java.util.Scanner;

public class Main0305_self {
    private int solution(int n) {
        int answer = 0;
        int sum = 0;

        // 시작지점...
        int lt = 0;
        // size보다 큰 값들은 이미 목표값 n을 초과하기 때문에 필요 없음(예 : 15 / 2 + 1 = 8)
        int size = n / 2 + 1;
        int[] arr = new int[size];

        // 계산 할 값을 담음
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // sliding window + two pointers = 애벌레
        for(int rt = 0; rt < arr.length; rt++) {
            sum += arr[rt];

            // 누적 값이 목표값과 같아지면 counting
            if(sum == n) {
                answer++;
            }

            // 노적 값이 목표값을 넘어서면
            while(sum >= n) {
                // 누적 값이 목표값과 같아지거나 작아질 때까지 index 0의 값부터 제거
                sum -= arr[lt++];

                // 빼던 중 목표값과 같아지면 counting
                if(sum == n) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Main0305_self T = new Main0305_self();
        System.out.println(T.solution(n));
    }
}
