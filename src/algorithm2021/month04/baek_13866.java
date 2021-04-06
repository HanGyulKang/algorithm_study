package algorithm2021.month04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baek_13866 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr.length; j++) {
                if(intArr[i] < intArr[j]) {
                    int temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }

        int A = intArr[intArr.length / 2] + intArr[(intArr.length / 2) - 1];
        int B = intArr[0] + intArr[intArr.length - 1];
        int res = Math.abs(A - B);

        bw.write(String.valueOf(res));
        bw.flush();
        br.close();
    }
}