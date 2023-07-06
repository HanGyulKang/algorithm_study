package basic.algorithm2021.month06;

import java.util.Scanner;

public class baek_10797 {
    /**
     * https://velog.io/@gang6607/백준-10797-10부제
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 차량번호 받기
        int carNum = scan.nextInt();
        // 10부제 위반 차량 수를 구할 변수
        int cnt = 0;

        for (int i = 0; i < 5; i++) {
            if(carNum == scan.nextInt()) {
                // 위반 차량 수
                cnt++;
            }
        }

        // 결과 출력
        System.out.println(cnt);
    }
}
