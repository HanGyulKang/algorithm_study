package InflearnJavaClass2021;

import java.util.Scanner;

public class Main008_self {
    public String solution(String str) {
        String answer = "YES";
        String temp = "";

        // 65 ~ 90
        for(char x : str.toCharArray()) {
            if((int)x >= 65 && (int)x <= 90) {
                temp += x;
            }
        }

        int len = temp.length();
        for (int i = 0; i < len / 2; i++) {
            if(temp.charAt(i) != temp.charAt(len - i - 1)) {
                answer = "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(new Main008_self().solution(str.toUpperCase()));
        scan.close();
    }
}
