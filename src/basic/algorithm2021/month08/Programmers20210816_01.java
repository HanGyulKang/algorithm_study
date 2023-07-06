package basic.algorithm2021.month08;

import java.util.Scanner;

public class Programmers20210816_01 {
    /*
    // 프로그래머스 코딩테스트연습 위클리 챌린지 1주차

    새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다.
    이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
    즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
    놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
    단, 금액이 부족하지 않으면 0을 return 하세요.
    */
    private long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 1; i <= count; i++) {
            answer += price * i;
        }

        // 두 수를 비교해서 한 값이 답인 경우는 max 또는 min 함수를 적절하게 사용하도록 하자...
        return Math.max(answer - money, 0);
    }

    public static void main(String[] args) {
        Programmers20210816_01 PROCESS = new Programmers20210816_01();
        Scanner scan = new Scanner(System.in);

        int price = scan.nextInt();
        int money = scan.nextInt();
        int count = scan.nextInt();

        System.out.println(PROCESS.solution(price, money, count));
    }
}
