package InflearnJavaClass2021.class01_String;

import java.util.Scanner;

public class Main005_teach {
    public String solution(String str) {
        String answer = "";

        char[] s = str.toCharArray();

        int lt = 0;
        int rt = str.length() - 1;

        while(lt < rt) {
            // isAlphabetic : 알파벳이면 true 아니면 false
            if(!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;

                lt++;
                rt--;
            }
        }

        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args) {
        Main005_teach T = new Main005_teach();

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));
    }
}
