package basic.algorithm2021.month05;

import java.util.Scanner;

public class baek_11948 {
    public static int sum = 0;

    public static int[] arraySortUtil(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;

            for (int j = 0; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static void arraySumUtil(int[] arr) {
        // 가장 작은 점수는 누락시킨다.
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
        }
    }

    public static void main(String[] args) {
        int[] scoreA = new int[4];
        int[] scoreB = new int[2];

        Scanner scan = new Scanner(System.in);

        // 시험 유형 A의 점수를 받는다
        for (int i = 0; i < scoreA.length; i++) {
            scoreA[i] = scan.nextInt();
        }

        // 시험 유형 B의 점수를 받는다
        for (int i = 0; i < scoreB.length; i++) {
            scoreB[i] = scan.nextInt();
        }

        // 정렬 유틸 메소드를 호출하여 배열을 큰 수 부터 정렬한다.
        scoreA = arraySortUtil(scoreA);
        scoreB = arraySortUtil(scoreB);

        // 가장 작은 값 하나를 제외한 나머지 값을 전역변수에 더하는 메소드를 호출한다.
        arraySumUtil(scoreA);
        arraySumUtil(scoreB);

        // 더해진 값을 출력한다.
        System.out.println(sum);

        // 다시 0으로 초기화한다.
        sum = 0;
    }
}
