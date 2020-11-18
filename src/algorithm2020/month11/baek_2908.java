package algorithm2020.month11;

import java.io.*;

public class baek_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력
        String str = br.readLine();

        // 문자열을 뒤집기위해 StringBuffer변수 선언
        StringBuffer sb = new StringBuffer();
        // 문자열 뒤집기
        sb = sb.append(str).reverse();

        // 뒤집은 문자열에서 " "(공백)을 기준으로 문자열을 분리해서 배열에 등록
        String[] strArr = (sb.toString()).split(" ");

        // 조건은 두 수 비교이기 때문에 반복문 없이 배열 Index로 바로 꺼냄
        int num1 = Integer.parseInt(strArr[0]);
        int num2 = Integer.parseInt(strArr[1]);

        if(num1 > num2) {
            bw.write(Integer.toString(num1));
        } else {
            bw.write(Integer.toString(num2));
        }

        bw.flush();
        br.close();
    }
}