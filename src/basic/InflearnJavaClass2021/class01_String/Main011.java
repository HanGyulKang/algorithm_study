package basic.InflearnJavaClass2021.class01_String;

import java.util.Scanner;

public class Main011 {
    public Main011() {
        // System.out.println("Main011 생성자 호출");
    }

    private String solution(String s) {
        String answer = "";
        s += " ";
        int cnt = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                answer += s.charAt(i);

                if(cnt > 1) {
                    answer += Integer.toString(cnt);
                    cnt = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        Main011 Obj = new Main011();
        System.out.println(Obj.solution(str));

    }
}
