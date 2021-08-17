package InflearnJavaClass2021;

import java.util.Scanner;

public class Main007 {
    private String solution_02(String str) {
        String answer = "YES";
        StringBuilder sb = new StringBuilder();
        sb.append(str);

        String temp = str;
        str = sb.reverse().toString();

        if(!temp.equals(str)) {
            answer = "NO";
        }

        return answer;
    }

    private String solution_01(String str) {
        String answer = "YES";
        char[] s = str.toCharArray();

        int lt = 0;
        int rt = str.length() - 1;

        while(lt < rt) {
            if(s[lt] != s[rt]) {
                answer = "NO";
            }

            lt++;
            rt--;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main007 T = new Main007();
        String str = scan.next().toUpperCase();

        System.out.println(T.solution_01(str));
        System.out.println(T.solution_02(str));
    }
}
