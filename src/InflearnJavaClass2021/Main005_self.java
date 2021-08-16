package InflearnJavaClass2021;

import java.util.Scanner;

public class Main005_self {
    private static String solution(String str) {
        String answer = "";

        int front = 0;
        int back = str.length() - 1;

        // 소문자 = 97 ~ 122, 대문자 = 65 ~ 90
        char[] c = str.toCharArray();

        while(front < back) {
            char tmp = 0;
            int frontChar = c[front];
            int backChar = c[back];

            int cnt = 0;

            if((frontChar >= 97 && frontChar <= 122) || (frontChar >= 65 && frontChar <= 90)) {
                cnt++;
            }
            if((backChar >= 97 && backChar <= 122) || (backChar >= 65 && backChar <= 90)) {
                cnt++;
            }

            if(cnt == 2) {
                tmp = c[front];
                c[front] = c[back];
                c[back] = tmp;
            }

            front++;
            back--;
        }

        answer = String.valueOf(c);
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(solution(scan.next()));
    }
}
