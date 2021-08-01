package InflearnJavaClass2021;

import java.util.Scanner;

public class Main002 {
    public String solution(String str, boolean flag) {
        String res = "";

        // 1. for each 풀이
        for (char c : str.toCharArray()) {
            if(flag) {
                // 1. lowercase, uppercase로 풀이
                if(Character.isLowerCase(c)) {
                    res += Character.toUpperCase(c);
                } else {
                    res += Character.toLowerCase(c);
                }
            } else {
                // 2. ASCII 코드로 풀이
                if(c >= 65 && c <= 90) { // 대문자
                    res += (char)(c + 32);
                } else if(c >= 97 && c <= 122) {
                    res += (char)(c - 32);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Main002 M002 = new Main002();

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(M002.solution(str, true));
    }
}
