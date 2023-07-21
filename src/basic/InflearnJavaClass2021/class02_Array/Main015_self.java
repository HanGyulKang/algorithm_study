package basic.InflearnJavaClass2021.class02_Array;

import java.util.Scanner;

public class Main015_self {
    private char[] solution(int cnt, int[][] arr) {
        char[] answer = new char[cnt];

        for (int i = 0; i < cnt; i++) {
            int A = arr[0][i];
            int B = arr[1][i];

            if(A == B) {
                answer[i] = 'D';
                continue;
            } else if(Math.abs(A - B) == 2) {
                answer[i] = A < B ? 'A' : 'B';
                continue;
            } else {
                answer[i] = A > B ? 'A' : 'B';
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main015_self T = new Main015_self();
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        int[][] arr = new int[2][cnt];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for(char x : T.solution(cnt, arr)) {
            System.out.println(x);
        }
    }
}
