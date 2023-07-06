package basic.InflearnJavaClass2021.class01_String;

import java.util.Scanner;

public class Main007_teach {
    public static String solution_01(String str) {
        int len = str.length();

        for(int i = 0; i < len / 2; i++) {
            // 0 1 ,, 2 3
            if(str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            }
        }

        return "YES";
    }

    public static String solution_02(String str) {
        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equalsIgnoreCase(tmp)) { // 대소문자 구분 x
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution_01(str.toUpperCase()));
        System.out.println(solution_02(str));
    }
}
