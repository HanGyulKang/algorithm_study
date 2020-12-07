package algorithm2020.month12;

import java.util.Scanner;

public class baek_2292 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int cnt = 1;

        int n = 1;
        while(a > n) {
            // 각 층은 1 (+6) -> 7 (+12) -> 19 (+18) -> 37 (+24) -> 61... 순으로 증가
            // 층을 오를 때 마다 6n을 더해줌
            n += (6 * cnt);
            cnt++;
        }
        System.out.println(cnt);
    }
}
