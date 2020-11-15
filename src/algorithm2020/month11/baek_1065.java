package algorithm2020.month11;

import java.util.ArrayList;
import java.util.Scanner;

public class baek_1065 {
    static void numChk(int num) {
        int total = 0;

        // 100 이하 값은 그대로 뱉음
        if (num < 100) {
            System.out.println(num);
        } else {
            total = 99;
            for (int k = 100; k <= num ; k++) {
                int getNum = k;
                ArrayList<Integer> arrNum = new ArrayList<>();

                // parameter로 받은 숫자의 1의 자리부터 하나씩 추출하기
                while (getNum != 0) {
                    int cutNum1 = getNum % 10;
                    int cutNum2 = (getNum % 100) / 10;
                    getNum = getNum / 10;

                    if(cutNum2 != 0) {
                        int setNum = cutNum1 - cutNum2;
                        // 각 자리수 숫자를 빼준 공차값을 ArrayList에 넣음
                        arrNum.add(setNum);
                    }

                }
                // 공차가 모두 같으면 cnt = 1
                int cnt = 0;
                for (int i = 0; i < arrNum.size() - 1; i++) {
                    if (arrNum.get(i) != arrNum.get(i + 1)) {
                        cnt = 0;
                    } else {
                        cnt = 1;
                    }
                }
                // 등차수열 발견시 total에 cnt(=1) 누적
                total += cnt;
            }
            System.out.println(total);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        numChk(a);
    }
}
