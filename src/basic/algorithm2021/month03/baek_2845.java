package basic.algorithm2021.month03;

import java.util.Scanner;

public class baek_2845 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int total = a * b;

        for (int i = 0; i < 5; i++) {
            int[] arr = new int[5];
            arr[i] = scan.nextInt();
            System.out.print((arr[i] - total) + " ");
        }
        scan.close();
    }
}
