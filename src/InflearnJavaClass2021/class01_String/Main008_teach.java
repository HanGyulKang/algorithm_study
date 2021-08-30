package InflearnJavaClass2021.class01_String;

import java.util.Scanner;

public class Main008_teach {
    public String solution_02(String s) {
        String answer = "YES";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");

        int len = s.length();

        for (int i = 0; i < len / 2; i++) {
            if(s.charAt(i) != s.charAt(len - i - 1)) {
                answer = "NO";
                break;
            }
        }

        return answer;
    }

    public String solution_01(String s) {
        String answer = "NO";

        // replaceAll에는 정규식 사용이 가능하다.
        s = s.toUpperCase().replaceAll("[^A-Z]", "");

        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) {
            return "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main008_teach T = new Main008_teach();

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(T.solution_01(str));
        System.out.println(T.solution_02(str));
    }
}
