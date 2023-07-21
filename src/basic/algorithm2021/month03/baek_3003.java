package basic.algorithm2021.month03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baek_3003 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] checkArr = {1,1,2,2,2,8};
        String[] str = (br.readLine()).split(" ");

        for (int i = 0; i < checkArr.length; i++) {
            int a = Integer.parseInt(str[i]);
            bw.write((checkArr[i]) - a + " ");
        }
        bw.flush();
        br.close();
    }
}
