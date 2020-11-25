package algorithm2020.month11;

import java.io.*;

public class baek_2941 {
    private static final String[] CROATIA = new String[]{"c=","c-","dz=","d-","lj","nj","s=","z="};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 문자열 받기
        String getStr = br.readLine();

        int cnt = 0;
        for (int i = 0; i < CROATIA.length; i++) {
            // 받은 문자열에 크로아티아 알파벳이 있을 경우
            if(getStr.contains(CROATIA[i])) {
                // 크로아티아 알파벳을 "*"로 치환후 임시 문자열에 넣어줌
                String tempStr = getStr.replace(CROATIA[i], "*");
                // 임시 문자열을 다시 getStr에 넣어주고 다시 반복문 진행
                getStr = tempStr;
            }
        }

        // 문자열에 치환한 문자 '*'가 있다면 cnt++
        for (int i = 0; i < getStr.length(); i++) {
            if(getStr.charAt(i) == '*') {
                cnt++;
            }
        }

        // 크로아티아 문자를 모두 제외한 문자열의 길이 + 크로아티아 문자를 체크한 횟수
        String resStr = Integer.toString(getStr.replace("*","").length() + cnt);
        bw.write(resStr);

        br.close();
        bw.flush();
    }
}
