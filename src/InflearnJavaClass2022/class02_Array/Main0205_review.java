package InflearnJavaClass2022.class02_Array;

import java.util.Scanner;

// 소수 구하기
public class Main0205_review {
    // 에라토스테네스 체
    private int sieveOfEratosthenes(int n) {
        int answer = 0;

        // index가 n번까지 생겨야하기 때문에 n + 1로 초기화 한다.
        int[] arr = new int[n + 1];

        // 반복문을 돌면서 arr[i]의 배수를 체크한다.
        for (int i = 2; i <= n; i++) {
            // 체크가 안 된(값이 0인) 경우 소수
            if (arr[i] == 0) {
                answer++;

                // j + i로 J를 증가시킨다(예 : i = 2 / j = 2 / j = 2 + 2)
                // 위와 같은 조건으로 i의 배수를 탐색하여 체크한다(값을 1로 변경)
                for (int j = i; j <= n; j = j + i) {
                    // 배수 index를 1로 초기화
                    arr[j] = 1;
                }
            }
        }

        return answer;
    }


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
        System.out.println("소수 구하기\t\t: " + T.solution(n));
        System.out.println("에라토스테네스 체\t: " + T.sieveOfEratosthenes(n));
    }
}
