package algorithm2020.month11;

import java.util.Scanner;

public class baek_2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        String str = "";
        int multiple = 0;

        for (int i = 0; i < cnt; i++) {
            multiple = scan.nextInt();
            str = scan.next();
            String resStr = "";

            int index = 0;
            for (int k = 0; k < multiple; k++) {
                char c = str.charAt(index);
                String setStr = "";
                // / 문자가 들어왔을 때 /문자를 받기위해 /를 하나 더 추가해서 set
                if(c == '\\') {
                    setStr = "\\";
                    resStr += setStr;
                } else {
                    resStr += c;
                }

                // k가 for문의 조건을 벗어날 때 다시 k의 값을 0으로 되돌려 반복문을 다시 실행하게 하기 위함
                if(k == multiple - 1) {
                    index++;
                    // -1을 넣어줘야 k++을 거쳐 for문으로 들어갔을때 k가 다시 0이 됨
                    k = -1;
                }
                // str문자열의 index가 str문자열의 길이와 같아지면(=마지막 index까지 다 돌았으면)
                // k에 multiple값을 넣어주고 for문 종료
                if (index == str.length()) {
                    k = multiple;
                }
            }
            // 결과는 반복문 1회당 한 번씩 출력
            System.out.println(resStr);
        }
    }
}
