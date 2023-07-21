package basic.algorithm2021.month02;

import java.io.*;

public class baek_1001 {
    // A - B
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean flag = true;
        while(flag) {
            String[] str = br.readLine().split(" ");

            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            if(a < 0 || a > 10) {
                System.out.println("첫 번째 값은 1이상 9이하입니다.");
            }
            if(b < 0 || b > 10) {
                System.out.println("두 번째 값은 1이상 9이하입니다.");
            }

            if(a > 0 || a < 10 || b > 0 || b < 10) {
                bw.write(Integer.toString(a - b));
                bw.flush();
                br.close();
                flag = false;
            }
        }
    }
}
