package InflearnJavaClass2021;

import java.util.Scanner;

public class Main012_self {
    private static final int DIVNUM = 7;

    private String solution(String str) {
        String answer = "";

        str = str.replace("#", "1");
        str = str.replace("*", "0");

        String tmp = "";
        for (int i = 0; i < str.length(); i++) {
            if((i + 1) % DIVNUM == 0) {
                tmp = str.substring(i + 1 - DIVNUM, i + 1);
                answer += (char)Integer.parseInt(tmp, 2);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        Main012_self Obj = new Main012_self();
        System.out.println(Obj.solution(str));

        scan.close();
    }
}
