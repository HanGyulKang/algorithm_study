package basic.algorithm2021.month03;

import java.util.Scanner;

public class baek_5522 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int cnt = 5;
        int total = 0;

        for (int i = 0; i < cnt; i++) {
            int a = scan.nextInt();
            if(a < 0 || a > 100) {
                throw new Exception("잘못된 값이 입력되었습니다.");
            }
            total += a;
        }
        System.out.println(total);
        scan.close();
    }
}
