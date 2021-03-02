package algorithm2021.month03;

import java.io.*;
import java.util.Scanner;

public class baek_2914 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt() - 1;

        System.out.println((a * b) + 1);
        scan.close();

        /* // BufferedReader와 BufferedWriter를 이용한 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = (br.readLine()).split(" ");

        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        bw.write(String.valueOf((A * (B - 1)) + 1));

        br.close();
        bw.flush();
        */
    }
}
