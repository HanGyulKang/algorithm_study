package InflearnJavaClass2022.class02_Array;

import java.util.Scanner;

// 소수 구하기
public class Main0205_review {
    private int solution(int n) {
        int answer = 1;

        // 1로는 무조건 나누어짐
        for (int i = 3; i < n; i++) {
            int chk = 2;
            boolean flag = true;

            while(chk < i) {
                if(i % chk == 0) {
                    flag = false;
                    break;
                }
                chk++;
            }

            if(flag) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Main0205_review T = new Main0205_review();
        System.out.println(T.solution(n));
    }
}
