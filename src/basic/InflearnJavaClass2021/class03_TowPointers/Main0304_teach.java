package basic.InflearnJavaClass2021.class03_TowPointers;

import java.util.Scanner;

public class Main0304_teach {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

        // 애벌레처럼 가네...
        for(int rt = 0; rt < n; rt++) {
            sum += arr[rt];

            if(sum == m) {
                answer++;
            }

            while(sum >= m) {
                sum -= arr[lt++];

                if(sum == m) {
                    answer++;
                }
            }
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

        System.out.println(new Main0304_teach().solution(n, m, arr));
    }
}
