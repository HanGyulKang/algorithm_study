package basic.InflearnJavaClass2022.class03_TowPointers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main0301_review2 {
    private static Scanner scan = new Scanner(System.in);

    public void valueToArray(int n, int[] arr) {
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
    }

    private ArrayList<Integer> solution(int n, int[] arrA, int m, int[] arrB) {
        ArrayList<Integer> answer = new ArrayList<>();

        // 첫 번째 배열용 포인터
        int p1 = 0;
        // 두 번째 배열용 포인터
        int p2 = 0;

        // 각 배열의 길이보다 포인터 값이 크거나 같으면 정지
        while(p1 < n && p2 < m) {
            // 오름차순으로 정렬해야하기 때문에 작은 수를 ArrayList에 넣는다.
            // 값을 넣은 배열의 포인터값을 후위연산자로 증가시켜 배열의 다음 Index값을 가져온다.
            if(arrA[p1] < arrB[p2]) {
                answer.add(arrA[p1++]);
            } else {
                answer.add(arrB[p2++]);
            }
        }

        // 두 배열의 길이가 다를 수 있기 때문에 남은 값들을 모두 넣어준다.
        // 문제의 조건 중 배열에 값은 오름차순으로 들어가있다는 조건이 있기 때문에 가능
        while(p1 < n) {
            answer.add(arrA[p1++]);
        }

        while(p2 < m) {
            answer.add(arrB[p2++]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main0301_review2 T = new Main0301_review2();

        int n = scan.nextInt();
        int[] arrA = new int[n];
        T.valueToArray(n, arrA);

        int m = scan.nextInt();
        int[] arrB = new int[m];
        T.valueToArray(m, arrB);

        for(int x : T.solution(n, arrA, m, arrB)) {
            System.out.print(x + " ");
        }
    }
}
