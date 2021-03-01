package algorithm2021.month03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class baek_2845 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int partyMember = scan.nextInt();
        int size = scan.nextInt();

        int totalMember = partyMember * size;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] newspaper = new int[5];
        String[] data = br.readLine().split(" ");
        for (int i = 0; i < 5; i++) {
            newspaper[i] = Integer.parseInt(data[i]);
            System.out.print((newspaper[i] - totalMember) + " ");
        }



    }
}
