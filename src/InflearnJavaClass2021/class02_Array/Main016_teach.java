package InflearnJavaClass2021.class02_Array;

import java.util.Scanner;

public class Main016_teach {
    public void solution_02(int n) {
        int a = 1, b = 1, c;

        for (int i = 2; i < n; i++) {
            c = a + b;

            a = b;
            b = c;
        }
    }

    public int[] solution_01(int n) {
        int[] answer = new int[n];

        answer[0] = 1;
        answer[1] = 1;

        for(int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Main016_teach T = new Main016_teach();
        for(int x : T.solution_01(n)) {
            System.out.print(x + " ");
        }

        T.solution_02(n);
    }
}
