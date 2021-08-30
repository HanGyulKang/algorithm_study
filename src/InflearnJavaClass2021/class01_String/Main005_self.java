package InflearnJavaClass2021.class01_String;

import java.util.Scanner;

public class Main005_self {
    private static String solution(String str) {
        String answer = "";

        int front = 0;
        int back = str.length() - 1;

        char[] c = str.toCharArray();

        while(front < back) {
            if(!Character.isAlphabetic(c[front])) {
                front++;
            } else if(!Character.isAlphabetic(c[back])) {
                back--;
            } else {
                char temp = c[front];
                c[front] = c[back];
                c[back] = temp;
                front++;
                back--;
            }
        }

        answer = String.valueOf(c);
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(solution(scan.next()));
    }
}
