package algorithm2021.month03;

import java.io.*;

public class baek_1297 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);

        long hypotenuse = a * a;
        long h = b * b;
        long w = c * c;

        double res = (double)hypotenuse / (double)(h + w);

        int height = (int)(Math.sqrt(res * h));
        int width = (int)(Math.sqrt(res * w));

        bw.write(height + " " + width);
        bw.flush();
        br.close();
    }
}
