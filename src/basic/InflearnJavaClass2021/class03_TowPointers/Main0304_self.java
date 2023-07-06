package basic.InflearnJavaClass2021.class03_TowPointers;

import java.util.Scanner;

public class Main0304_self {
    private int solution(int n, int m, int[] arr) {
        int answer = 0;
        int pointer = 0;

        // O(n2)으로 좋지 않다...
        while(pointer < n) {
            int sum = 0;

            for(int i = pointer; i < n; i++) {
                sum += arr[i];
                // 누적값이 목표한 m보다 커지면 break로 for문 탈출
                if(sum > m) {
                    break;
                // 누적값과 동일해진다면 answer를 ++ 해주고 break로 for문 탈출
                } else if(sum == m) {
                    answer++;
                    break;
                }
            }
            // for문을 전부 다 돌았거나 break로 탈출한 경우 pointer++해서 다음 index부터 다시 탐색
            pointer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(new Main0304_self().solution(n, m, arr));
    }
}
