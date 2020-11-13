package algorithm2020.month11;

import java.util.ArrayList;

public class baek_1065 {
    static void numChk(int num) {
        int getNum = num;
        ArrayList<Integer> arrNum = new ArrayList<>();

        // parameter로 받은 숫자의 1의 자리부터 하나씩 추출하기
        while(getNum != 0) {
            int cutNum1 = getNum % 10;
            int cutNum2 = (getNum % 100) / 10;
            getNum = getNum / 10;

            if(cutNum2 != 0) {
                int setNum = cutNum1 - cutNum2;
                arrNum.add(setNum);
            }
        }

        int cnt = 0;
        for (int i = 0; i < arrNum.size(); i++) {
            if(i != arrNum.size()) {
                if(arrNum.get(i) == arrNum.get(i+1)) {
                    cnt++;
                }
            }
        }
    }

    public static void main(String[] args) {
        numChk(10251);
        // 작업중... 2020 11 13 21:58
    }
}
