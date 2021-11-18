package InflearnJavaClass2021.review;

import java.util.ArrayList;
import java.util.Scanner;

public class Main0206_20211118 {
    private boolean isPrime(int n) {
        // 숫자 1은 소수가 아님
        if(n == 1) {
            return false;
        }

        // 소수는 1과 자기자신으로만 나뉘어야하기 때문에 두 수는 범위에서 제외
        // 1과 자기자신 사이 수로 나뉘어지면 false
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int temp = arr[i];
            int res = 0;

            // 숫자 뒤집기
            while(temp > 0) {
                // 끝 자리 수 추출
                int t = temp % 10;
                // 기존에 넣은 값을 한 자리수 증가시키고 끝자리(t) 넣기
                res = res * 10 + t;
                // res변수에 담은 끝자리 제거
                temp = temp / 10;
            }

            // 소수 체크
            if(isPrime(res)) {
                answer.add(res);
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

        Main0206_20211118 T = new Main0206_20211118();
        for(int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
