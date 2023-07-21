package basic.algorithm2021.month06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class baek_15680 {
    /**
     * https://velog.io/@gang6607/백준-15680-연세대학교
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        // 숫자와 출력 문자열 맵핑
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "YONSEI");
        map.put(1, "Leading the Way to the Future");

        // 결과 출력
        System.out.println(map.get(a));
    }
}
