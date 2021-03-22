package algorithm2021.month03;

import java.io.*;

public class baek_5596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[2];
        for (int i = 0; i < 2; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < 4; j++) {
                arr[i] += Integer.parseInt(str[j]);
            }
        }
        int S = arr[0];
        int T = arr[1];
        bw.write(String.valueOf(S >= T ? S : T));

        bw.flush();
        br.close();
    }
}
