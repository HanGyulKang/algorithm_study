package InflearnJavaClass2021.review;

import java.util.ArrayList;
import java.util.Scanner;

public class Main0206_20211118 {
    private ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int temp = arr[i];
            int res = 0;

            while(temp > 0) {
                int t = temp % 10;
                res = res * 10 + t;
                temp = temp / 10;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for(int x : new Main0206_20211118().solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
