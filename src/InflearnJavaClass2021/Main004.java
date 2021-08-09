package InflearnJavaClass2021;

import java.util.Scanner;

public class Main004 {
    private static String solution_self(String str, int selCase) throws Exception {
        if(selCase == 1) {
            // 1. for문을 이용한 방식
            int len = str.length() - 1;
            StringBuffer sb = new StringBuffer();

            for (int i = len; i >= 0; i--) {
                sb.append(str.charAt(i));
            }

            return sb.toString();
        } else if(selCase == 2) {
            // 2. StringBuffer 클래스 내의 내장함수(reverse())를 이용한 방식
            StringBuffer sb = new StringBuffer(str);
            return sb.reverse().toString();
        } else {
            throw new Exception(selCase + " 은(는) 정상적인 테스트 케이스 번호가 아닙니다.");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        for (int i = 0; i < cnt; i++) {
            String str = scan.next();
            System.out.println(solution_self(str, 0));
        }
    }
}
