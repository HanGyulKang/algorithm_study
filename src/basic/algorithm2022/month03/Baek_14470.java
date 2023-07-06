package basic.algorithm2022.month03;

import java.util.Scanner;

public class Baek_14470 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt(); // 원래 고기의 온도
        int B = scan.nextInt(); // 목표 온도
        int C = scan.nextInt(); // 얼어있는 고기를 1℃ 데우는데 걸리는 시간
        int D = scan.nextInt(); // 고기를 해동하는데 걸리는 시간
        int E = scan.nextInt(); // 얼지않은 고기를 1℃ 데우는데 걸리는 시간

        // 목표 온도까지 고기를 데우는 시간을 담을 변수
        int answer = 0;

        // 고기가 목표하는 온도까지 반복
        while(A < B) {
            // 고기 온도가 영하인지 영상인지 아니면 0인지를 먼저 체크
            if(A == 0) {
                // 0도일 경우(애초에 시작이 0도이거나 또는 영하인 고기의 온도가 올라서 0도에 도달했을 경우
                // 해동 시간을 누적
                answer += D;
                // 해동 이후 최하단 A++로 온도가 올라가기 때문에 얼지않은 고기를 데우는 시간을 추가로 누적한다
                answer += E;
            } else if(A < 0) {
                // 얼어있는 고기를 데우는 시간 누적
                answer += C;
            } else if(A > 0) {
                // 녹아있는 고기를 데우는 시간 누적
                answer += E;
            }

            // 위 세 가지 경우의 수를 통과했을 경우 무조건 고기 온도를 1℃ ++
            A++;
        }

        System.out.println(answer);
    }
}
