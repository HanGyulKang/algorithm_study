package InflearnJavaClass2021.class03_TowPointers;

import java.util.Scanner;

public class Main0305_self {
    private int solution(int n) {
        int answer = 0;
        int lt = 0;
        int sum = 0;

        int[] arr = new int[n / 2 + 1];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // Sliding Window + Tow Pointers = 애벌레처럼 기어가는 형상
        for(int rt = 0; rt < arr.length; rt++) {
            // 오른쪽이 증가하면서 누적
            sum += arr[rt];

            // 목표값과 같아지면 counting
            if(sum == n) {
                answer++;
            }

            // 목표값을 넘어서면...
            while(sum >= n) {
                // 0번째 index 값부터 제거
                sum -= arr[lt++];

                // 제거하던 중 목표값과 같아지면 다시 counting
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
