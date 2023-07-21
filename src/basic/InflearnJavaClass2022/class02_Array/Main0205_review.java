package basic.InflearnJavaClass2022.class02_Array;

import java.util.Scanner;

// 소수 구하기
public class Main0205_review {
    // 에라토스테네스 체
    private int sieveOfEratosthenes(int n) {
        int answer = 0;

        // 소수 체크할 배열
        int[] arr = new int[n + 1];

        // 2 미만은 체크하는 의미가 없음(소수)
        for (int i = 2; i < n; i++) {
            // 들어오는 i값의 배수는 모두 소수가 아님
            // 소수일 경우 배열 값을 0으로 내버려둠, 소수일 경우 1로 변경
            if(arr[i] == 0) {
                // 0인채로 남아있다면 소수
                answer++;

                // 에라토스테네스 체
                // j = j + i로 사실 i에 i를 계속 누적한다(즉, i의 배수를 체로 추려내는 개념)
                for(int j = i; j < n; j = j + i) {
                    // i의 배수인 경우는 모두 소수가 아니기 때문에 값을 1로 변경한다.
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
