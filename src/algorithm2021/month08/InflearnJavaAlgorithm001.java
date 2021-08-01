package algorithm2021.month08;

import java.util.Scanner;

public class InflearnJavaAlgorithm001 {
    // 문제풀이 함수
    public int solution(String str, char c, boolean flag) {
        int res = 0;

        // 문자열 모두 대문자 변환
        str = str.toUpperCase();
        // 입력받은 문자를 대문자로 변환
        c = Character.toUpperCase(c);

        if(flag) {
            // 1. 일반적인 for 문
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    res++;
                }
            }
        } else {
            // 2. for each문
            //  ** toCharArray : 문자열의 문자 배열 객체를 생성
            for (char x : str.toCharArray()) {
                if(x == c) {
                    res++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        InflearnJavaAlgorithm001 C = new InflearnJavaAlgorithm001();

        // Scanner 객체 생성
        Scanner scan = new Scanner(System.in);

        // 콘솔 문자열 받음
        String str = scan.next();
        // 콘솔 문자 받음(Index = 0)
        char c = scan.next().charAt(0);

        // solution 함수 호출(true : 일반적인 for문, flase : for each문)
        System.out.println(C.solution(str, c, true));
    }
}
