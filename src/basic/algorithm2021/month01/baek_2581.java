package basic.algorithm2021.month01;

import java.util.ArrayList;
import java.util.Scanner;

public class baek_2581 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = N; i <= M ; i++) {
            int num = i;
            int cnt = 0;

            for (int j = 1; j <= num; j++) {
                if(num % j == 0) {
                    cnt++;
                }
            }
            if(cnt == 2) {
                arrList.add(i);
            }
        }

        int total = 0;
        if(arrList.size() > 0) {
            for (int i = 0; i < arrList.size(); i++) {
                total += arrList.get(i);
            }
            System.out.println(total);
            System.out.println(arrList.get(0));
        } else {
            total = -1;
            System.out.println(total);
        }
    }
}
