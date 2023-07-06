package basic.InflearnJavaClass2022.class03_TowPointers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main0301_review {
    public ArrayList<Integer> solution(int n, int[] arrA, int m, int[] arrB) {
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        while(p1 < n && p2 < m) {
            if(arrA[p1] < arrB[p2]) {
                answer.add(arrA[p1++]);
            } else {
                answer.add(arrB[p2++]);
            }
        }

        while(p1 < n) {
            answer.add(arrA[p1++]);
        }
        while(p2 < m) {
            answer.add(arrB[p2++]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main0301_review T = new Main0301_review();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arrA = new int[n];

        for(int i = 0; i < n; i++) {
            arrA[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int[] arrB = new int[m];

        for (int i = 0; i < m; i++) {
            arrB[i] = scan.nextInt();
        }

        for(int i : T.solution(n, arrA, m, arrB)) {
            System.out.print(i + " ");
        }
    }
}
