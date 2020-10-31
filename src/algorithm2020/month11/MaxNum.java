package algorithm2020.month11;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numArr = new int[9];
        int max = 0;
        int index = 0;

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = scan.nextInt();

            if(numArr[i] > max) {
                max = numArr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index + 1);

        scan.close();
    }
}
