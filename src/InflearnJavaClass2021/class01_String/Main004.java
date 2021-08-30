package InflearnJavaClass2021.class01_String;

import java.util.ArrayList;
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
            return new StringBuffer(str).reverse().toString();
            // 또는 StringBuilder를 사용해도 된다(메소드 명은 동일함);
            // return new StringBuilder(str).reverse().toString();
        } else {
            throw new Exception(selCase + " 은(는) 정상적인 테스트 케이스 번호가 아닙니다.");
        }
    }

    private static ArrayList<String> solution_teach(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            // String 객체가 너무 많이 생성되면 StringBuilder를 사요하기도 한다.
            // 방법 1
            // String tmp = new StringBuilder(x).reverse().toString();
            // answer.add(tmp);

            // 방법 2
            char[] s = x.toCharArray();

            int lt = 0;
            int rt = x.length() - 1;

            // 핵심 조건
            while(lt < rt) {
                char cTemp = s[lt];
                s[lt] = s[rt];
                s[rt] = cTemp;

                lt++;
                rt--;
            }

            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();

        // 내 풀이방법
        for (int i = 0; i < cnt; i++) {
            // String str = scan.next();
            // System.out.println(solution_self(str, 0));
        }

        String[] str = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            str[i] = scan.next();
        }

        for (String x : solution_teach(cnt, str)) {
            System.out.println(x);
        }
    }
}
