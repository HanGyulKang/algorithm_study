package basic.InflearnJavaClass2021.review;

import java.util.ArrayList;
import java.util.Scanner;

public class Main0201_20211111 {
    private ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 앞의 번호가 없기 때문에 index 0의 값은 무조건 add
        answer.add(arr[0]);

        for(int i = 1; i < n; i++) {
            // 앞 번호와 비교
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

        Main0201_20211111 T = new Main0201_20211111();
        for(int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
