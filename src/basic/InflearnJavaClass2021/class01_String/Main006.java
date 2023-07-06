package basic.InflearnJavaClass2021.class01_String;

import java.util.Scanner;

public class Main006 {
    private String solution_self(String str) {
        String answer = "";
		
        while(str.length() > 0) { // 문자열이 모두 비워질 때까지 반복
            answer += str.charAt(0); // 문자열의 맨 앞자리만 누적
            str = str.replace(String.valueOf(str.charAt(0)), ""); // 누적한 문자열을 replace로 제거
        }
		
        return answer;
    }    
    
    private static String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        Main006 T = new Main006();

        System.out.println(solution(str));
        System.out.println(T.solution_self(str));
    }
}
