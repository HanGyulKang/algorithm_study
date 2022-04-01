package InflearnJavaClass2022.class04_Hash;

import util.ArrayUtil;

import java.util.ArrayList;
import java.util.HashMap;

public class Main0403_self {
    // 매출종류 구하기
    private ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        // n   : 장사 일 수
        // k   : 구간 일 수
        // arr : 각 일별 매출액

        // 1. 우선 처음 구간 값의 매출 종류부터 구한다.
        for(int i = 0; i < k; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }
        // 담긴 매출 종류 개수를 배열에 담는다.
        answer.add(hashMap.size());


        return answer;
    }

    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int n = util.scan.nextInt();
        int k = util.scan.nextInt();
        int[] arr = new int[n];

        util.valueToArray(n, arr);

        for(int x : new Main0403_self().solution(n, k, arr)) {
            System.out.print(x + " ");
        }
    }
}
