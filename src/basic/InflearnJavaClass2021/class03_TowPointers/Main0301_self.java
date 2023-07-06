package basic.InflearnJavaClass2021.class03_TowPointers;

import java.util.Arrays;
import java.util.Scanner;

public class Main0301_self {
    public int[] solution(int n, int m, int[] arr_A, int[] arr_B) {
        int[] answer = new int[n + m];

        for (int i = 0; i < answer.length; i++) {
            if(i < n) {
                answer[i] = arr_A[i];
            } else {
                answer[i] = arr_B[i - n];
            }
        }
        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr_A = new int[n];

        for (int i = 0; i < n; i++) {
            arr_A[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int[] arr_B = new int[m];

        for (int i = 0; i < m; i++) {
            arr_B[i] = scan.nextInt();
        }

        Main0301_self T = new Main0301_self();
        for(int x : T.solution(n, m, arr_A, arr_B)) {
            System.out.print(x + " ");
        }
    }
}
