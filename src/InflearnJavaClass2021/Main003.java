package InflearnJavaClass2021;

import java.io.*;

public class Main003 {
    public static String solution(String str) {
        String[] strArr = str.split(" ");
        String strRes = "";
        int temp = 0;

        for(String s : strArr) {
            if(temp < s.length()) {
                strRes = s;
                temp = s.length();
            }
        }

        return strRes;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}
