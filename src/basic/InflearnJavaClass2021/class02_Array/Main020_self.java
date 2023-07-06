package basic.InflearnJavaClass2021.class02_Array;

import java.util.Scanner;

public class Main020_self {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[n];
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i] < arr[j]) {
                    cnt++;
                }
            }

            answer[i] = cnt;
            cnt = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main020_self T = new Main020_self();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for(int x : T.solution(arr, n)) {
            System.out.print(x + " ");
        }

    }
}
