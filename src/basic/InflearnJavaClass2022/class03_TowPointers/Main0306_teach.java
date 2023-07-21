package basic.InflearnJavaClass2022.class03_TowPointers;

import java.util.Scanner;

public class Main0306_teach {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;

        int cnt = 0; // rt가 0을 1로 변경한 횟수
        int lt = 0;

        // rt가 증가하면서 길이를 계속 구해야 함(rt - lt + 1)
        // rt가 0을 만나면 무조건 1로 변경
        for(int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) {
                cnt++;
            }

            while(cnt > k) {
                if(arr[lt] == 0) {
                    cnt--;
                }
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main0306_teach T = new Main0306_teach();

        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(n, k, arr));

    }
}
