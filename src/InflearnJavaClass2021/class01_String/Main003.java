package InflearnJavaClass2021.class01_String;

import java.io.*;
import java.util.Scanner;

public class Main003 {
    public static String solution_self(String str) {
        String[] strArr = str.split(" ");

        // return할 문자열 변수
        String strRes = "";
        // 임시 문자열 길이 저장 변수
        int temp = 0;

        for(String s : strArr) {
            // 임시 문자열 길이와 새로 들어온 문자열 길이를 비교하는 조건
            // '크다' 가 아닌 '크거나 같다' 라는 조건을 주면 맨 앞 쪽 단어가 아닌 마지막 단어를 추출하게 됨
            if(temp < s.length()) {
                // 새로 들어온 문자열이 기존 문자열보다 길다면 각 변수에 담는다.
                strRes = s;
                temp = s.length();
            }
        }

        return strRes;
    }

    private static String solution_teach01(String str) {
        String answer = "";
        // 가장 작은 값으로 초기화
        int m = Integer.MIN_VALUE;

        String[] s = str.split(" ");
        for(String x : s) {
            int len = x.length();

            if(len > m) {
                m = len;
                answer = x;
            }
        }

        return answer;
    }

    private static String solution_teach02(String str) {
        String answer = "";

        int m = Integer.MIN_VALUE, pos;

        // (A) 2. 마지막 문자열에는 공백이 없기 때문에 while문을 벗어나게 됨
        while((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);

            int len = tmp.length();
            if(len > m) {
                m = len;
                answer = tmp;
            }
            // str 변수 갱신(체크한 문자열은 누락시키고 이후 문자열부터 들어가게끔 갱신)
            str = str.substring(pos + 1);
        }

        // (A) 1. 마지막 문자열 조건처리
        if(str.length() > m) {
            answer = str;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        // 1. solution_self 호출
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution_self(str));
        br.close();
        */

        // 2. solution_teach 호출
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(solution_teach01(str));
        System.out.println(solution_teach02(str));
    }
}
