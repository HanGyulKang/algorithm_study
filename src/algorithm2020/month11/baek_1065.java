package algorithm2020.month11;

import java.util.ArrayList;

public class baek_1065 {
    static void numChk(int num) {
        int total = 0;

        for (int k = 100; k <= num ; k++) {
            int getNum = k;
            ArrayList<Integer> arrNum = new ArrayList<>();

            // parameter로 받은 숫자의 1의 자리부터 하나씩 추출하기
            while (getNum != 0) {
                int cutNum1 = getNum % 10;
                int cutNum2 = (getNum % 100) / 10;
                getNum = getNum / 10;

                if (cutNum2 != 0) {
                    int setNum = cutNum1 - cutNum2;
                    arrNum.add(setNum);
                }
            }
            int cnt = 1;
            for (int i = 0; i < arrNum.size(); i++) {
                if (i < arrNum.size() - 1) {
                    if (arrNum.get(i) != arrNum.get(i + 1)) {
                        cnt = 0;
                    }
                }
            }
            total += cnt;
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        numChk(210);
        // 작업중... 2020 11 13 21:58
    }
}
