package basic.InflearnJavaClass2022.class04_Hash;

import java.util.HashMap;
import java.util.Scanner;

public class Main0401_teach {
    private char solution(int n, String str) {
        char answer = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0));
        }

        // 'A'라는 키 값이 있는지 여부 확인
        // map.containsKey('A');

        // map 안에 key가 몇 개 있는지 확인
        // map.size();

        // 'A'라는 특정 키를 삭제하고 삭제된 key의 개수(Integer)를 return
        // map.remove('A');
        int max = Integer.MIN_VALUE;
        for (char x : str.toCharArray()) {
            if(map.get(x) > max) {
                max = map.get(x);
                answer = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();

        Main0401_teach T = new Main0401_teach();
        System.out.println(T.solution(n, str));
    }
}
