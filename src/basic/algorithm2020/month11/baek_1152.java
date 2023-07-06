package basic.algorithm2020.month11;

import java.io.*;

public class baek_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 앞 뒤 공백 제거를 위해 trim 사용
        String str = br.readLine().trim();

        if(str.isEmpty()) { // 받은 문자열이 없으면 0 출력
            bw.write("0");
        } else { // 받은 문자열이 있다면 " "(공백)을 기준으로 잘라서 배열에 넣어주고 배열 길이(=단어 개수) 출력
            String[] strArr = str.split(" ");
            bw.write(Integer.toString(strArr.length));
        }

        // 담아둔 버퍼 비우고 리더 종료
        bw.flush();
        br.close();
    }
}
