package basic.InflearnJavaClass2021.class01_String;

import java.util.Scanner;

public class Main009_teach {
    public int solution_02(String str) {
        String answer = "";

        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) {
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }

    public int solution_01(String str) {
        int answer = 0;

        for (char x : str.toCharArray()) {
            if(x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main009_teach T = new Main009_teach();

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution_01(str));
        System.out.println(T.solution_02(str));
    }
}
