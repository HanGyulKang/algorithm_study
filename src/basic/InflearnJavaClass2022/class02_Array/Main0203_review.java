package basic.InflearnJavaClass2022.class02_Array;

import java.util.Scanner;

public class Main0203_review {
    public String[] solution(int n, int[] arrA, int[] arrB) {
        String[] answer = new String[n];

        /*
        * 1 : 가위
        * 2 : 바위
        * 3 : 보
        */
        for(int i = 0; i < n; i++) {
            if(arrA[i] == arrB[i]) {
                answer[i] = "D";
            } else {
                // 같은 경우 빼곤 4가 되는 경우는 가위와 보가 만날 확률밖에 없음
                if(arrA[i] + arrB[i] == 4) {
                    answer[i] = arrA[i] > arrB[i] ? "B" : "A";
                } else {
                    answer[i] = arrA[i] > arrB[i] ? "A" : "B";
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = scan.nextInt();
        }

        Main0203_review T = new Main0203_review();
        for(String x : T.solution(n, arr1, arr2)) {
            System.out.println(x);
        }

    }
}
