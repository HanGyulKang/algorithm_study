package algorithm2020.month12;

import java.util.Arrays;
import java.util.Scanner;

public class baek_1427 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        int size = num.length();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = num.charAt(i) - '0';
        }

        // 1번 방식
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if(arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
        }

        System.out.println();

        // 2번 방식
        Arrays.sort(arr);
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < size; i++) {
            sb.append(arr[i]);
        }
        System.out.println(sb.reverse());
    }
}
