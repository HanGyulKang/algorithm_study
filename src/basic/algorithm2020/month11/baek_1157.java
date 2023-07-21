package basic.algorithm2020.month11;

import java.util.Scanner;

public class baek_1157 {
    // 가장 많이 사용한 단어를 대문자로 출력
    public static void main(String[] args) {
        // a ~ z : 97 ~ 122
        // A ~ Z : 65 ~ 90
        int SIZE = (90 - 65) + 1; // (122 - 97) + 1과 같음

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        // 알파벳 위치(대, 소문자 구분 없고 배열 index에 +n을 해줘서 해당 위치에 맞는 대문자를 출력함)
        int[] alphaArr = new int[SIZE];

        for (int i = 0; i < str.length(); i++) {
            int alphaNum = str.charAt(i);
            int index = 0;

            if(alphaNum > 96 && alphaNum < 123) { // 소문자일 경우
                index = alphaNum - 97;
            } else { // 그 외 경우(대문자일 경우)
                index = alphaNum - 65;
            }
            // 해당 알파벳 위치값 ++
            alphaArr[index]++;
        }

        // alphaArr 안의 최대값 구하기(가장 많이 사용한 알파벳 찾기)
        int max = 0;
        int max_index = 0;
        for (int i = 0; i < alphaArr.length; i++) {
            if(alphaArr[i] > max) {
                max = alphaArr[i];
                // 최대값을 가진 index 추출
                max_index = i;
            }
        }

        // 가장 많이 사용한 단어가 많을 경우 ? 출력하기 위한 조건
        int cnt = 0;
        for (int i = 0; i < alphaArr.length; i++) {
            if(alphaArr[max_index] == alphaArr[i]) {
                // 중복값이 있을 경우 2회 이상, 없을 경우 본인과 비교해서 1회만 증가되고 끝
                cnt++;
            }
        }

        // 결과 출력
        if(cnt == 1) {
            char resChar = (char)(max_index + 65);
            System.out.println(resChar);
        } else {
            System.out.println("?");
        }

    }
}
