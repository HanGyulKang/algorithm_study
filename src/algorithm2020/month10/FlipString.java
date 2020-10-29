package algorithm2020.month10;

import java.util.Scanner;

public class FlipString {
    private static String getFlipString(String str) {
        char[] charArr = new char[str.length()];
        int cnt = charArr.length;
        String returnStr = "";

        // char 1차원 배열에 받은 문자열 한 단어씩 넣기
        for (int i = 0; i < cnt; i++) {
            charArr[i] = str.charAt(i);
        }

        // 문자열을 뒤집어서 입력 받기
        for (int i = 0; i < cnt; i++) {
            returnStr += charArr[cnt -(i+1)];
        }
        return returnStr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        // 두 단어 이상 받을 수 있도록 조건 처리
        if(str.length() < 1) {
            System.out.println("받은 문자열이 없습니다. 두 단어 이상 입력하세요.");
            String[] garbageStringArr = new String[0];
            main(garbageStringArr);
        }

        //받은 문자열을 뒤집는 메소드 호출
        String flipStr = getFlipString(str);
        System.out.println(flipStr);
    }
}


