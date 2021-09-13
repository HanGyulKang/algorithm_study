package InflearnJavaClass2021.class02_Array;

import java.util.Scanner;

public class Main019_self {
    public int solution(int[] arr, int n) {
        int answer = 0;
        int tmp = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                tmp++;
                answer += tmp;
            } else {
                tmp = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(new Main019_self().solution(arr, n));
    }
}
