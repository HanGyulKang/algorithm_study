package algorithm2021.month07;

import java.util.Scanner;

/**
 * 문자열을 입력받은 뒤 아래와 같이 출력하세요.
 * 입력 : APPLE
 *
 * 출력 :
 * A
 * AP
 * APP
 * APPL
 * APPLE
 */
public class MaeilCoding0712_02 {
    private static void process(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        process(str);
    }
}
