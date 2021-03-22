package algorithm2021.month03;

import java.io.*;

public class baek_5575 {
    private static BufferedReader br;
    private static BufferedWriter bw;

    public static String getWorkTime(int h, int m, int s) {
        if (s < 0) {
            s += 60;
            m--;
        }
        if (m < 0) {
            m += 60;
            h--;
        }
        return h + " " + m + " " + s;
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 0;
        while(i < 3) {
            String[] getStr = br.readLine().split(" ");

            int resHour = Integer.parseInt(getStr[3]) - Integer.parseInt(getStr[0]);
            int resMin = Integer.parseInt(getStr[4]) - Integer.parseInt(getStr[1]);
            int resSec = Integer.parseInt(getStr[5]) - Integer.parseInt(getStr[2]);

            bw.write(getWorkTime(resHour, resMin, resSec));
            bw.newLine();
            i++;
        }
        bw.flush();
        br.close();
    }
}