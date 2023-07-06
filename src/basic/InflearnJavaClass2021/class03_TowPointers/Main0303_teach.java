package basic.InflearnJavaClass2021.class03_TowPointers;

import java.util.Scanner;

public class Main0303_teach {
    // Sliding Window
    public int solution(int n, int k, int[] arr) {
        int answer, sum = 0;

        for(int i = 0; i < k; i++) sum += arr[i];
        answer = sum;

        for(int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for(int i = 0; i < k; i++) {

        }

        Main0303_teach T = new Main0303_teach();
        System.out.println(T.solution(n, k, arr));
    }
}
