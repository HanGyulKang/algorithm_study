package basic.InflearnJavaClass2022.class04_Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main0403_teach {
    private ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();

        // k - 1일째까지만 담는 것으로 초기화
        for(int i = 0; i < k - 1; i++) {
            HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for(int rt = k - 1; rt < n; rt++) {
            // 부족분이었던 마지막 하루분을 마저 담고
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
            // 사이즈를 answer에 담는다.
            answer.add(HM.size());
            // 왼쪽 포인터의 값은 사라지는 것이기 때문에 -1
            HM.put(arr[lt], HM.get(lt) - 1);

            // 삭제 대상인 lt key의 value가 0이라면
            if(HM.get(arr[lt]) == 0) {
                // HashMap에서 제거
                HM.remove(lt);
            }
            lt++;
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

        for(int x : new Main0403_teach().solution(n, k, arr)) {
            System.out.print(x + " ");
        }
    }
}
