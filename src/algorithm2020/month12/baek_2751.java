package algorithm2020.month12;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class baek_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        br.close();

        Collections.sort(arr);
        StringBuffer sb = new StringBuffer();
        for (Integer i : arr) {
            sb.append(i + "\n");
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());

        bw.flush();
    }
}
