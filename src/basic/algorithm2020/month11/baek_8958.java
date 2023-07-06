package basic.algorithm2020.month11;

import java.util.Scanner;

public class baek_8958 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        boolean flag = true;

        while(flag) {
            char[] charArr = null;
            String str = "";

            int i = 0;
            for (; i < cnt; i++) {
                str = scan.next();
                charArr = new char[str.length()];

                int total = 0;
                int score = 1;
                for (int j = 0; j < str.length(); j++) {
                    charArr[j] = str.charAt(j);
                    if('O' == charArr[j]) {
                        total += score++;
                    } else {
                        score = 1;
                    }
                }
                System.out.println(total);
            }
            if(i==cnt) {
                flag = false;
            }
        }
        scan.close();
    }
}
