package algorithm2020.month11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_11720 {
    // 입력받은 숫자들의 합 구하기(문자열을 사용해서 풀기)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int total = 0;
        for (int i = 0; i < size; i++) {
            total += str.charAt(i) - '0';
        }

        System.out.println(total);
        br.close();
    }
}
