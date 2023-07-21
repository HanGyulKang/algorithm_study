package basic.algorithm2020.month11;

import java.util.Scanner;

public class baek_1316 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int check = 0;

        for (int num = 0; num < cnt; num++) {
            // a : 97, z: 122
            String str = scan.next();
            String getStr = "";
            boolean flag = false;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                String word = str.substring(i, i + 1);

                if(!((int)c >= 97 && (int)c <= 122)) {
                    throw new Exception("영문 소문자만 입력해야 합니다.");
                } else if (str.length() == 1){
                    flag = true;
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

            if(flag) {
                check++;
            }
        }
        System.out.println(check);
    }
}
