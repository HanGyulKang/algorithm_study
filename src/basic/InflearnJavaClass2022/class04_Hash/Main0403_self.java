package basic.InflearnJavaClass2022.class04_Hash;

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
        // 1. 초기 값을 잡아준다.
        for(int i = 0; i < k; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }
        answer.add(hashMap.size());

        // 2. 초기값 + 1일부터 two pointer 알고리즘으로 푼다.
        for(int i = k; i < n; i++) {
            // rt값을 hashMap에 넣어준다.
            // 이미 있는 값이면 Value만 1 증가하고 없는 값이면 1을 셋팅한다.
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);

            // hashMap이 lt값을 가지고있는지 판단한다.
            if(hashMap.containsKey(arr[i - k])) {
                // 가지고있을 경우 Value를 1 감소시킨다.
                hashMap.replace(arr[i - k], hashMap.get(arr[i- k]) - 1);
            }

            // lt값에 해당하는(매출종류) Key의 value가 0이라면
            // 즉 전진하는 구간 사이에서 매출종류가 사라졌다면
            // hashMap에서 제거한다.
            if(hashMap.get(arr[i - k]) == 0) {
                hashMap.remove(arr[i - k]);
            }

            // 최종 결과를 ArrayList에 담는다.
            answer.add(hashMap.size());
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
