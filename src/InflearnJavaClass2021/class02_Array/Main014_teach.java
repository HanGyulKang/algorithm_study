package InflearnJavaClass2021.class02_Array;

import java.util.Scanner;

public class Main014_teach {
    public int solution(int[] arr) {
        int answer = 1, max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main014_teach T = new Main014_teach();

        int cnt = scan.nextInt();
        int[] arr = new int[cnt];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(arr));
    }
}
