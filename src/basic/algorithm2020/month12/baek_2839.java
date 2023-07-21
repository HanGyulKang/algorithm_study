package basic.algorithm2020.month12;

import java.util.Scanner;

public class baek_2839 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int answer = 0;

        int div5 = n/5;
        n = n%5;
        int div3 = n/3;
        n = n%3;

        while(true) {
            if(div5 < 0) {
                System.out.println(-1);
                break;
            }else if(n == 0){
                answer = div5 + div3;
                System.out.println(answer);
                break;
            }else {
                n += 5;
                n += div3*3;
                div3 = 0;
                div5--;
                div3 = n/3;
                n = n%3;
            }
        }

    }
}
