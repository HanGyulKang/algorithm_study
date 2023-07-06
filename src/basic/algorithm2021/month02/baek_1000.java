package basic.algorithm2021.month02;

import java.io.*;

public class baek_1000 {
    // A + B
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        bw.write(Integer.toString(a + b));

        bw.flush();
        br.close();


    }
}
