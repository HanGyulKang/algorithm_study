package basic.InflearnJavaClass2021.class01_String;

import java.util.Scanner;

public class Main007_self {
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
        Main007_self T = new Main007_self();
        String str = scan.next().toUpperCase();

        System.out.println(T.solution_01(str));
        System.out.println(T.solution_02(str));
    }
}
