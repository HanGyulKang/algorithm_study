package basic.algorithm2021.month03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class baek_1037 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int min = 0;


        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        max = Math.max(a,b);
        min = Math.min(a,b);

        System.out.println(max * min);
    }
}
