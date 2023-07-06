package basic.algorithm2020.month11;

import java.util.Scanner;

public class baek_1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();

        double max = 0;
        double total = 0;
        double[] scoreArr = new double[cnt];

        // 시험 점수 중 최대 점수 찾기
        for (int i = 0; i < cnt; i++) {
            scoreArr[i] = scan.nextInt();
            if(max < scoreArr[i]) {
                max = scoreArr[i];
            }
        }

        // 시험 점수 조작하기 (n/max)*100
        for (int i = 0; i < cnt; i++) {
            scoreArr[i] = (scoreArr[i] / max) * 100;
            total += scoreArr[i];
        }

        // 조작된 평균 점수 출력
        System.out.println(total / cnt);

    }
}
