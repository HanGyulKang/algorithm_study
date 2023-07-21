package basic.algorithm2020.month12;

import java.io.*;

public class baek_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String getStr = br.readLine();

        // A : 낮에 올라가는 높이
        // B : 밤에 떨어지는 높이
        // V : 총 올라가야하는 높이
        double A = Integer.parseInt(getStr.split(" ")[0]);
        double B = Integer.parseInt(getStr.split(" ")[1]);
        double V = Integer.parseInt(getStr.split(" ")[2]);

        // V를 올라간 일수
        int res = (int)(Math.ceil((V - A) / (A - B)) + 1);

        // 출력
        bw.write(Integer.toString(res));
        br.close();
        bw.flush();

    }
}


