package InflearnJavaClass2021.class01_String;

import java.util.Scanner;

public class Main012_teach {
    public String solution(int n, String s) {
        String answer = "";

        for(int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            s = s.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main012_teach T = new Main012_teach();
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        String str = scan.next();

        System.out.println(T.solution(cnt, str));
        scan.close();
    }
}
