package algorithm2020.month11;

import java.util.Scanner;

public class baek_3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = 0;
        int[] numArr = new int[10];

        // 정수 입력
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = scan.nextInt() % 42;
        }

        // 서로 다른 나머지 값 개수 구하기
        for (int i = 0; i < numArr.length; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] == numArr[j]) {
                    cnt++;
                }
            }
        }
        System.out.println(numArr.length - cnt);

    }
}
