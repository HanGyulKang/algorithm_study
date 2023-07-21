package basic.InflearnJavaClass2021.class02_Array;

import java.util.Scanner;

public class Main023_teach {
    public int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;

            for(int j = 1; j <= n; j++) { // 학년별 각 학생
                for (int k = 1; k <= 5; k++) { // 학년
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break; // 같은반이었던 학생이 있다면 중복 카운팅을 하지 않기 위해 break
                    }
                }
            }

            if(cnt > max) {
                max = cnt;
                answer = i; // 그 때 그 때 최대값인 학생을 전달
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main023_teach T = new Main023_teach();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] arr = new int[n + 1][6];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5 ; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));
    }
}
