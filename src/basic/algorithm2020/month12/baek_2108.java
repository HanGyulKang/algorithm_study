package basic.algorithm2020.month12;

import java.util.*;

public class baek_2108 {
    // 순서대로 정렬
    public static int[] sort(int n, int[] arr) {
        int N = n;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(j == N - 1) {
                    break;
                } else if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double total = 0;

        if(N == 1) {
            int a = scan.nextInt();
            System.out.println(a);
            System.out.println(a);
            System.out.println(a);
            System.out.println(a - a);
            return;
        } else if(N < 1) {
            throw new Exception("최초 입력값이 잘못되었습니다.");
        }

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
            total += arr[i];
        }
        scan.close();

        // 평균값 구하기
        double avg = total / N;
        System.out.println(Math.round(avg));

        // 순서대로 정렬 후 중간 값 구하기
        int[] sortArr = sort(N, arr);
        System.out.println(sortArr[N / 2]);

        // 최빈값 구하기
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            // 해쉬맵 초기값 입력
            hashMap.put(arr[i], 0);
        }

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            if(hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i] + 1));
                hashSet.add(arr[i]);
            }
        }

        int max = 0;
        for (Integer integer : hashSet) {
            for (int i = 0; i < hashSet.size(); i++) {
                if(hashMap.get(integer) > max) {
                    max = hashMap.get(integer);
                }
            }
        }

        ArrayList<Integer> arrList = new ArrayList<>();
        for (Integer integer : hashSet) {
            if(hashMap.get(integer) == max) {
                arrList.add(integer);
            }
        }

        int[] arr2 = new int[arrList.size()];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arrList.get(i);
        }

        arr2 = sort(arr2.length, arr2);

        if(arr2.length < 2) {
            System.out.println(arr2[arr2.length - 1]);
        } else {
            System.out.println(arr2[arr2.length - (arr2.length - 1)]);
        }

        // 최대값과 최소값 차이 구하기
        int interval = sortArr[sortArr.length - 1] - sortArr[0];
        System.out.println(interval);
    }
}
























