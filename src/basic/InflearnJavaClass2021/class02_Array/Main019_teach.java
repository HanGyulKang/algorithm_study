package basic.InflearnJavaClass2021.class02_Array;

import java.util.Scanner;

public class Main019_teach {
    private int solution(int n, int[] arr) {
        int answer = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main019_teach T = new Main019_teach();

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[n] = scan.nextInt();
        }

        System.out.println(T.solution(n, arr));
    }
}
