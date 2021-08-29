package InflearnJavaClass2021;

import java.util.Scanner;

public class Main010_teach {
    public int[] solution(String str, char t) {
        int[] answer = new int[str.length()];

        int p = 1000;
        for(int i = 0; i < answer.length; i++) {
            if(str.charAt(i) == t) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }

        p = 1000;
        for(int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main010_teach T = new Main010_teach();

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);

        for (int x : T.solution(str, c)) {
            System.out.println(x + " ");
        }
    }
}
