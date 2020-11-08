package algorithm2020.month11;

import java.util.Scanner;

public class baek_4344 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt1 = 0;
        double cnt2 = 0;

        cnt1 = scan.nextInt();

        for (int i = 0; i < cnt1; i++) {
            cnt2 = scan.nextInt();

            int total = 0;
            double cnt3 = 0;
            int[] score = new int[(int)cnt2];

            for (int j = 0; j < cnt2; j++) {
                score[j] = scan.nextInt();
                total += score[j];
            }

            int avg = total / (int)cnt2;
            for (int j = 0; j < cnt2; j++) {
                if (score[j] > avg) {
                    cnt3++;
                }
            }
            double res = cnt3/cnt2;
            // 평균을 넘는 학생 비율 출력
            System.out.println(String.format("%.3f",res * 100) +"%");
        }
    }
}
