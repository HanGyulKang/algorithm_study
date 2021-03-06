package algorithm2021.month03;

import java.util.Scanner;

public class baek_11283 {
    public static void main(String[] args) {
        // 19, 21, 28

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = str.charAt(0);

        // 초성 공식
        // ((문자유니코드 - 0xAC00)/28)/21
        char f = (char)(((c - 0xAC00) / 28) / 21);

        // 중성 공식
        // (문자유니코드 - 0xAC00) / 28 % 21
        char m = (char)(((c - 0xAC00) / 28) % 21);

        // 종성 공식
        // (문자유니코드 - 0xAC00) % 28
        char b = (char)((c - 0xAC00) % 28);

        int A = f;
        int B = m;
        int C = b == 0 ? 1 : b + 1;
        System.out.println();

    }
}

