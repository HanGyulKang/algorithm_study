package InflearnJavaClass2022.class04_Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main0403_self {
    // 매출종류 구하기
    private ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        // n   : 장사 일 수
        // k   : 구간 일 수
        // arr : 각 일별 매출액
        int p1 = 0;
        int p2 = k;

        while(p2 <= n) {
            for(int i = p1; i < p2; i++) {
                hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
            }
            answer.add(hashMap.size());
            hashMap.clear();
            p1++;
            p2++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for(int x : new Main0403_self().solution(n, k, arr)) {
            System.out.print(x + " ");
        }
    }
}
