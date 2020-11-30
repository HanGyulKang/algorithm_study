package algorithm2020.month11;

import java.io.*;

public class baek_1712 {
    private static int checker(int aa, int bb, int cc) {
        int resCnt = 0;
        int a = aa;
        int b = bb;
        int c = cc;

        if(b >= c) {
            return -1;
        } else {
            int sellTotal = a;
            int makeTotal = 0;
            int cnt = 0;

            while(true) {
                sellTotal += b;
                makeTotal += c;
                System.out.println(sellTotal + " : " + makeTotal);
                cnt++;

                if(makeTotal > sellTotal) {
                    resCnt = cnt;
                    break;
                }
            }
        }

        return resCnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] splitStr = br.readLine().split(" ");

        int a = Integer.parseInt(splitStr[0]);
        int b = Integer.parseInt(splitStr[1]);
        int c = Integer.parseInt(splitStr[2]);

        int cnt = checker(a, b, c);
        bw.write(Integer.toString(cnt));

        bw.flush();
        br.close();
    }
}
