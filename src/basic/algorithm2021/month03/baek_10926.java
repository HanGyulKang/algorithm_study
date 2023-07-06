package basic.algorithm2021.month03;

import java.util.Scanner;

public class baek_10926 {
    // 그냥 문자열 joonas에 문자열 ??! 를 붙이고 출력하면 되는 문제였지만
    // 조건문으로 검증하고 각 조건에 따라 다른 문자열을 출력하는 것으로도 작성 해 봄
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String id = "joonas";
        String surprise = "??!";

        StringBuffer sb = new StringBuffer();
        sb.append(str);

        if(id.equals(str)) {
            sb.append(surprise);
            System.out.println(sb.toString());
        } else {
            System.out.println(sb.toString());
        }
    }
}
