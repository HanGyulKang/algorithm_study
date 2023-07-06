package basic.util;

import java.util.Scanner;

public class ArrayUtil {
    public Scanner scan = new Scanner(System.in);

    public void valueToArray(int n, int[] arr) {
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
    }
}
