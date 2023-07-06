package basic.InflearnJavaClass2022.class02_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main0201_review {
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
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        Main0201_review T = new Main0201_review();
        for(int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
