import java.util.Scanner;

public class DailyTraining {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 10;
        int[][] arr = new int[2][n];

        // int 배열을 선언할 경우 이미 내부 값들이 0, 0으로 초기화 되어서
        // 아래 임의 좌표를 받을 때 0, 0 좌표는 못받는다.
        // 그렇기 때문에 임의 값(Integer.MIN_VALUE)으로 배열 원소 값을 초기화시켜준다.
        for(int i = 0; i < n; i++) {
            arr[0][i] = Integer.MIN_VALUE;
            arr[1][i] = Integer.MIN_VALUE;
        }

        // 기준이 되는 x, y값을 받는다.
        int X = scan.nextInt();
        int Y = scan.nextInt();

        // 기준 값과 거리 비교를 할 x, y값을 받는다.
        // 이 때, 이미 들어온 좌표값이 있을 경우 메시지를 출력하고 입력을 다시 받는다.
        for(int i = 0; i < n; i++) {
            System.out.println((i + 1) + "번째 좌표값 입력 : ");

            int x = scan.nextInt();
            int y = scan.nextInt();

            boolean flag = false;

            for(int j = 0; j < n; j++) {
                if(arr[0][j] == x && arr[1][j] == y) {
                    // 똑같은 값이 들어올 경우 메시지
                    System.out.println("똑같은 좌표가 이미 있습니다.");
                    flag = true;
                }
                if(arr[0][j] == X && arr[1][j] == Y) {
                    // 기준 좌표와 똑같은 값이 들어올 경우 메시지
                    System.out.println("기준 좌표와 똑같은 값이 입력되었습니다.");
                    flag = true;
                }
            }

            // 똑같은 값이 들어오면 i를 빼주고(원위치) for문 시작지점으로 간다(continue).
            if(flag) {
                i--;
                continue;
            }

            // 위 if문에 걸리지 않았으면 배열에 좌표값을 넣는다.
            arr[0][i] = x;
            arr[1][i] = y;
        }

        // 받은 좌표값 중 기준 좌표와 가장 가까운(먼저 들어온) 좌표를 출력한다.
        // 1. 번 방식
        // int min = Integer.MAX_VALUE;
        // 2. 번 방식
        double min = Integer.MAX_VALUE;
        int res = 0;
        for(int i = 0; i < n; i++) {
            // 1. (들어온 좌표 x - 기준 좌표 x) + (들어온 좌표 y - 기준 좌표 y) : 절대값을 사용하여 거리값을 구한다.
            // int m = Math.abs(arr[0][i] - X) + Math.abs(arr[1][i] - Y);
            // 2. 루트(제곱(x1 - x2) + 제곱(y1 - y2))
            double m = Math.sqrt(Math.pow(X - arr[0][i], 2) + Math.pow(Y - arr[1][i], 2));

            // 가장 작은 값(min)보다 작은 값이 들어올 경우
            if(min > m) {
                // min보다 작은 값을 min에 다시 넣어준다.
                min = m;
                // 최소값이 들어온 좌표를 저장한다.
                res = i;
            }
        }

        // 최소값이 들어온 좌표를 출력한다.
        System.out.println(arr[0][res] + ", " + arr[1][res]);
    }
}