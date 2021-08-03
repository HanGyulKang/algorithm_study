package InflearnJavaClass2021;

import java.io.*;

public class Main {
    public static String solution(String str) {
        String[] strArr = str.split(" ");

        for(String s : strArr) {
            System.out.println(s);
        }

        return "";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }
}
