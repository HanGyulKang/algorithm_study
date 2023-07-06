package basic.InflearnJavaClass2022.class04_Hash;

import java.util.HashMap;
import java.util.Scanner;

public class Main0401_self {
    private char solution(int n, String str) {
        if(str.length() != n) {
            System.out.println("입력된 길이와 문자열의 길이가 다릅니다.");
            return 0;
        }

        char answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : str.toCharArray()) {
            // getOrDefault : map 에 키 값이 있으면 기존 Value를 가져오고 없으면 defaultValue를 넣는다.
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        // map의 keySet을 가져와서 해당 key의 value가 max보다 클 경우 answer에 key값을 담는다.
        for(char key : map.keySet()) {
            if(max < map.get(key)) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();

        Main0401_self T = new Main0401_self();
        System.out.println(T.solution(n, str));
    }
}
