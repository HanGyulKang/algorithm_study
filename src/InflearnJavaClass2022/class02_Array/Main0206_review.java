package InflearnJavaClass2022.class02_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main0206_review {
    // static 선언으로 main method가 실행될 때 클래스 객체를 메모리에 올림
    private static Main0206_review T = new Main0206_review();

    private boolean chkPrimeNumber(int n) {
        boolean flag = true;

        // 소수인지 여부 체크
        for (int i = 2; i < n ; i++) {
            if(n % i == 0) {
                flag = false;
                break;
            }
        }

        // 1 이하는 소수가 아님
        if(n <= 1) {
            flag = false;
        }

        return flag;
    }

    private ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 받은 숫자 뒤집기
        for (int i = 0; i < n; i++) {
            int k = arr[i];
            int prime = 0;

            // 받은 숫자의 첫 번째 자리 수를 꺼내고 10으로 나누어서 첫 번째 자리 수를 날림 : 반복
            while(k > 0) {
                // 첫 번째 자리 수 꺼냄
                int chk = k % 10;
                // 꺼낸 후 본체는 나누기 10을 하여 첫 번째 자리 수를 날림
                k = k / 10;

                // 꺼낸 첫 번째 자리 수는 따로 변수에 담아 둠
                prime += chk;

                // 위에서 10으로 나눈 k값이 0보다 클 때만 꺼낸 첫 번째 자리 수 * 10
                // 10으로 나눈 값이 0이하가 된다면 마지막 숫자가 꺼내졌기 떄문에 * 10을 하면 10배수가 됨
                if(k > 0) {
                    // * 10을 하여 다음 숫자가 들어올 자리를 마련함
                    prime *= 10;
                }
            }

            if(T.chkPrimeNumber(prime)) {
                answer.add(prime);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for(int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
