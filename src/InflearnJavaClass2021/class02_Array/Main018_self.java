package InflearnJavaClass2021.class02_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main018_self {
    public boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }

        // 1과 자기 자신을 제외한 값으로 소수인지 체크 : 나누어지는 수가 하나라도 있으면 소수x
        for (int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }

    private ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int res = 0;

            // 숫자 뒤집는 공식
            while(temp > 0) {
                int t = temp % 10;
                res = res * 10 + t;
                temp = temp / 10;
            }

            // 소수 확인
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

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        Main018_self T = new Main018_self();
        for(int x : T.solution(arr)) {
            System.out.print(x + " ");
        }
    }
}
