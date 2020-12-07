package algorithm2020.month12;

import java.util.Scanner;

public class baek_10872 {
    static int call(int i) {
        if(i <= 1) {
            return 1;
        } else {
            return i * call(i - 1);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        if(i < 0 || i > 12) {
            throw new Exception("조건 : 0 <= N <= 12");
        } else {
            System.out.println(call(i));
        }
    }
}
