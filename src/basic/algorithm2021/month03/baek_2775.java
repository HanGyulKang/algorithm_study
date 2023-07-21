package basic.algorithm2021.month03;

import java.util.Scanner;

public class baek_2775 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] d2Arr = new int[15][15];

        for (int i = 0; i < d2Arr.length; i++) {
            d2Arr[0][i] = i + 1;
            d2Arr[i][0] = 1;
        }

        for (int i = 1; i < d2Arr.length; i++) {
            for (int j = 1; j < d2Arr[i].length; j++) {
                d2Arr[i][j] = d2Arr[i - 1][j] + d2Arr[i][j - 1];
            }
        }

        int cnt = scan.nextInt();
        for (int i = 0; i < cnt; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(d2Arr[a][b - 1]);
        }
    }
}
