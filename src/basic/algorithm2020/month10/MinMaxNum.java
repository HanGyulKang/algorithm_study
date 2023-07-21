package basic.algorithm2020.month10;

import java.util.Scanner;

public class MinMaxNum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int[] numArr = new int[cnt];

        int min = 999;
        int max = 0;

        for (int i = 0; i < cnt; i++) {
            numArr[i] = scan.nextInt();
            if(numArr[i] < min) {
                min = numArr[i];
            }
            if(numArr[i] > max) {
                max = numArr[i];
            }
        }

        System.out.println(min + " " + max);
        scan.close();
    }
}
