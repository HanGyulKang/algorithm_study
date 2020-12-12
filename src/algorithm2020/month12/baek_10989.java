package algorithm2020.month12;

import java.util.Arrays;
import java.util.Scanner;

public class baek_10989 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        Arrays.sort(arr);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i] +"\n");
        }
        System.out.println(sb);
    }
}
