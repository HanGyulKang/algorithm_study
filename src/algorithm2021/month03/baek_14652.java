package algorithm2021.month03;

import java.io.*;

public class baek_14652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");

        int y = Integer.parseInt(str[0]);
        int x = Integer.parseInt(str[1]);
        int l = Integer.parseInt(str[2]);

        int num = 0;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if(num++ == l) {
                    bw.write(i + " " + j);
                }
            }
        }
        bw.flush();
        br.close();
    }
}
