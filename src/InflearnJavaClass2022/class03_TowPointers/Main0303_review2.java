package InflearnJavaClass2022.class03_TowPointers;

import util.ArrayUtil;

public class Main0303_review2 {
    private int solution(int n, int k, int[] arr) {
        int answer;
        int sum = 0;

        /*
        n : 배열 길이
        k : 연속된 날짜 조건
         */
        // 우선 연속된 날짜 조건만큼 누적 값으로 answer를 초기화한다.
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;

        // k 이전까진 모두 누적했으니 i는 k값부터 출발하면 됨
        for (int i = k; i < n; i++) {
            // 앞으로 한 칸 전진해서 값을 더해줌
            sum += arr[i];
            // 맨 앞에 있었던 값을 빼줌
            sum -= arr[i - k];

            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        int n = arrayUtil.scan.nextInt();
        int k = arrayUtil.scan.nextInt();
        int[] arr = new int[n];

        arrayUtil.valueToArray(n, arr);

        System.out.println(new Main0303_review2().solution(n, k, arr));
    }
}
