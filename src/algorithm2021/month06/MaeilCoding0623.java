package algorithm2021.month06;

import java.util.Scanner;

public class MaeilCoding0623 {
    // 약수 구하기(내림차순)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        for (int i = num; i >= 1 ; i--) {
            if(num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
