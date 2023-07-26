package dfs.뇌더듬더듬살리기;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class 단어공부_백준1157 {
    /**
     * [문제 링크]
     * https://www.acmicpc.net/problem/1157
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine().toUpperCase();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        int max = 0;
        char maxKey = '0';
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            Integer value = entry.getValue();;

            if(max <= value) {
                max = value;
                maxKey = key;
            }
        }

        int count = 0;
        Object[] array = map.values().toArray();
        for (int i = 0; i < array.length; i++) {
            int n = (int)array[i];

            if(n == max) {
                count++;
            }
        }

        if(count > 1) {
            bw.write("?");
        } else {
            bw.write(String.valueOf(maxKey));
        }

        br.close();
        bw.close();
    }
}
