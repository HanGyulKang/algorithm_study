package basic.algorithm2020.month11;

public class baek_4673 {
    public static int number(int num) {
        // num을 total에 바인딩
        int total = num;
        // while문 스위치
        boolean flag = true;

        // parameter로 받은 num을 한 자리씩 줄이면서 1의자리 수만 추출해서 total에 더하기
        while(flag) {
            total += num % 10;
            num = num / 10;
            // num이 한 자리수만 남았을 때 flag를 false로 만들어서 while문 정지
            if(num == 0) {
                flag = false;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int num = 10000;
        int[] numArr = new int[10000];

        for (int i = 1; i < num; i++) {
            int setArr = number(i);
            // (생성자가 있는 숫자 == 배열의 index)일 때 임의로 1을 넣음
            if(setArr < 10000) {
                numArr[setArr] = 1;
            }
        }

        for (int i = 1; i < numArr.length; i++) {
            // 위에서 1을 넣어주지 않은 배열의 index 일 때 i를 출력(꼼수)
            if(numArr[i] == 0) {
                System.out.println(i);
            }
        }
    }

}
