package basic.algorithm2021.month03;

import java.io.*;

public class baek_8370 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] strArr = (br.readLine()).split(" ");

        int cnt = 2;
        int total = 0;
        // 받은 배열을 2개씩 끊어서 곱해준 값을 total에 누적
        while(true) {
            if(cnt > strArr.length) {
                break;
            } else {
                total += (Integer.parseInt(strArr[cnt - 2]) * Integer.parseInt(strArr[cnt - 1]));
                cnt += 2;
            }
        }

        bw.write(String.valueOf(total));
        bw.flush();
        br.close();
    }
}
