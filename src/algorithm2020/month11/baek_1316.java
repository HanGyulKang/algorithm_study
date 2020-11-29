package algorithm2020.month11;

import java.util.Scanner;

public class baek_1316 {
    // 2020 11 28 작업중...
    public static void main(String[] args) throws Exception {
        /*
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        ArrayList<Integer> arrList = new ArrayList<>();
        for(char c = 'a'; c <= 'z'; c++) {
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == c) {
                    arrList.add(i);
                }
            }
            System.out.println(c + " : " + arrList.toString());
            arrList.removeAll(arrList);
        }
        */

        Scanner scan = new Scanner(System.in);

        // a : 97, z: 122
        String str = scan.next();
        String getStr = "";
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String word = str.substring(i, i + 1);

            if(!((int)c >= 97 && (int)c <= 122)) {
                throw new Exception("영문 소문자만 입력해야 합니다.");
            } else {
                if(i == 0) {
                    getStr = word;
                } else {
                    String beforeWord = str.substring(i - 1, i);
                    if(!beforeWord.equals(word)) {
                        if(getStr.indexOf(word) < 0) {
                            flag = true;
                            getStr += word;
                        } else {
                            flag = false;
                        }
                    } else {
                        flag = true;
                    }

                    if(!flag) {
                        break;
                    }
                }
            }
        }

        if(!flag) {
            System.out.println("그룹단어가 아님");
        } else {
            System.out.println("그룹단어가 맞음");
        }
    }
}
