package basic.InflearnJavaClass2022.class04_Hash;

import java.util.HashMap;
import java.util.Scanner;

// 아나그램 문제
// 아나그램 : 문자열의 길이가 같을 때 알파벳의 나열 순서가 다르지만 구성요소가 같은 것
public class Main0402_self {
    // 받은 문자열을 map에 입력하기 위한 mathod
    private void stringToHashMap(String str, HashMap<Character, Integer> map) {
        for(char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
    }

    private String solution(String s1, String s2) {
        HashMap<Character, Integer> map_A = new HashMap<>();
        HashMap<Character, Integer> map_B = new HashMap<>();

        // 받은 문자열을 map에 집어 넣음
        stringToHashMap(s1, map_A);
        stringToHashMap(s2, map_B);

        for(char x : s1.toCharArray()) {
            // 동일한 키 값을(문자를) 가지고있는지 체크
            if(map_A.containsKey(x) && map_B.containsKey(x)) {
                // 동일한 키 값을 가지고 있을 경우 value(문자 개수)가 같은지 체크
                if(map_A.get(x) != map_B.get(x)) {
                    return "NO";
                }
            } else {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();

        Main0402_self T = new Main0402_self();
        System.out.println(T.solution(str1, str2));
    }
}
