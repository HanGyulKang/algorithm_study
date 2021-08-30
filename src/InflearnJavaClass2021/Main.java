package InflearnJavaClass2021;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if(arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();

        int[] arr = new int[cnt];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        Main T = new Main();
        for(int n : T.solution(cnt, arr)) {
            System.out.print(n + " ");
        }
    }
}
