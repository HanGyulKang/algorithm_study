package basic.InflearnJavaClass2021.class01_String;

import java.util.Scanner;

public class Main009_self {
    public String solution(String str) {
        String answer = "";
        char[] x = str.toCharArray();

        for(char s : x) {
            if(!Character.isAlphabetic(s)) {
                answer += s;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main009_self O = new Main009_self();

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(Integer.parseInt(O.solution(str)));

        scan.close();
    }
}
