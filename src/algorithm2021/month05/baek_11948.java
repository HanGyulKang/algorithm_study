package algorithm2021.month05;

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
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
        }
    }

    public static void main(String[] args) {
        int[] scoreA = new int[4];
        int[] scoreB = new int[2];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < scoreA.length; i++) {
            scoreA[i] = scan.nextInt();
        }

        for (int i = 0; i < scoreB.length; i++) {
            scoreB[i] = scan.nextInt();
        }

        scoreA = arraySortUtil(scoreA);
        scoreB = arraySortUtil(scoreB);

        arraySumUtil(scoreA);
        arraySumUtil(scoreB);

        System.out.println(sum);

        sum = 0;
    }
}
