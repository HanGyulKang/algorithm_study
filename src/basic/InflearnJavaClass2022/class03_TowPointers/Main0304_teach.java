package basic.InflearnJavaClass2022.class03_TowPointers;

import java.util.Scanner;

public class Main0304_teach {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = 0;
        int sum = 0;

        // 반복문 안에서 lt가 rt를 따라가는 모양새
        for(int rt = 0; rt < n; rt++) {
            sum += arr[rt];

            // 확인
            if(sum == m) {
                answer++;
            }

            // lt는 빼면서 index 증가
            while(sum >= m) {
                sum -= arr[lt++];

                // 확인
                if(sum == m) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main0304_teach T = new Main0304_teach();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(n, m, arr));
    }
}
