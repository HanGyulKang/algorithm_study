package algorithm2020.month11;

import java.io.*;

public class baek_1712 {
    private static int checker(int a, int b, int c) {
        if(b >= c) {
            return -1;
        } else {
            return (a/(c-b))+1;
        }
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
