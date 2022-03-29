package InflearnJavaClass2022.class03_TowPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main0302_review2 {
    private static ArrayList<Integer> solution(int n, int[] arrA, int m, int[] arrB) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 포인터 생성
        int p1 = 0;
        int p2 = 0;

        // 같은 값을 추출하기 위해 우선 정렬
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        // 각 포인터가 각 배열 값 미만인 동안 반복
        // 정렬이 된 두 배열을 비교하면서 서로 크고 작음 또는 같음을 비교하는 로직이 내부에 있기 때문에
        // 한 쪽 포인터라도 배열 길이 이상이 된다면 더 이상 탐색이 불필요하다.
        while(p1 < n && p2 < m) {
            // 각 배열의 값이 서로 같으면 ArrayList에 넣는다.
            // 정렬이 되어있는 상태이기 때문에 값을 넣은 후에는 두 포인터의 값을 함께 증가시켜준다.
            // 두 배열의 값 중 작은 값이 있다면 큰 값까지 쫓아가야하기 때문에 작은값을 가진 배열의 포인터 값을 증가시켜준다.
            if(arrA[p1] == arrB[p2]) {
                answer.add(arrA[p1]);
                p1++;
                p2++;
            } else if(arrA[p1] < arrB[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main0301_review2 T = new Main0301_review2();

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arrA = new int[n];
        T.valueToArray(n, arrA);

        int m = scan.nextInt();
        int[] arrB = new int[m];
        T.valueToArray(m, arrB);

        for(int x : solution(n, arrA, m, arrB)) {
            System.out.print(x + " ");
        }
    }
}
