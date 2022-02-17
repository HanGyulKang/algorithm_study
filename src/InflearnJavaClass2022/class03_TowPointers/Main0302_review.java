package InflearnJavaClass2022.class03_TowPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main0302_review {
    public ArrayList<Integer> solution(int n, int[] arrA, int m, int[] arrB) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 중복되는 숫자를 담기 전에 sorting (비교 로직 사전 준비)
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        int p1 = 0;
        int p2 = 0;

        while(p1 < n && p2 < m) {
            if(arrA[p1] == arrB[p2]) {
                answer.add(arrA[p1++]);
                p2++;
            } else if(arrA[p1] < arrB[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main0302_review T = new Main0302_review();

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arrA = new int[n];
        for(int i = 0; i < n; i++) {
            arrA[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int[] arrB = new int[m];
        for(int i = 0; i < m; i++) {
            arrB[i] = scan.nextInt();
        }

        for(int x : T.solution(n, arrA, m, arrB)) {
            System.out.println(x + " ");
        }

    }
}
