package InflearnJavaClass2021;

import java.util.Scanner;

public class Main007_teach {
    public static String solution_01(String str) {
        String answer = "YES";
        int len = str.length();

        for(int i = 0; i < len / 2; i++) {
            // 0 1 ,, 2 3
            if(str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(solution_01(str.toUpperCase()));
    }
}
