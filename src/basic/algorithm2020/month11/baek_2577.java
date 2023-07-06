package basic.algorithm2020.month11;

import java.util.Scanner;

public class baek_2577 {
    // 각 정수 a, b, c를 곱한 결과값이 0부터 9까지의 숫자를 각각 몇 번 사용했는지 출력
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int resNum = a * b * c;

        String resStr = Integer.toString(resNum);
        int[] arrNum = new int[resStr.length()];
        
        for (int i = 0; i < resStr.length(); i++) {
            arrNum[i] = resStr.charAt(i) - 48;
        }

        int cnt = 0;
        int checkNum = 0;
        for (int i = 0; i < 10; i++) {
            checkNum = i;
            for (int j = 0; j < arrNum.length; j++) {
                if(arrNum[j] == checkNum) {
                    cnt++;
                }
            }
            System.out.println(cnt);
            cnt = 0;
        }

    }
}
