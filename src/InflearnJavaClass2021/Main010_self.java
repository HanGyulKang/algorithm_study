package InflearnJavaClass2021;

import java.util.Scanner;

public class Main010_self {
    public void solution(String str1, char s) {
        int p = str1.length();
        int[] arr = new int[str1.length()];

        for (int i = 0; i < arr.length; i++) {
            if(str1.charAt(i) != s) {
                p++;
            } else {
                p = 0;
            }
            arr[i] = p;
        }

        for (int i = arr.length - 1; i >= 0 ; i--) {
            if(str1.charAt(i) != s) {
                p++;
            } else {
                p = 0;
            }

            // 두 수를 비교해서 크거나 작은 수를 넣으려면 if문보다는 Math클래스의 min 또는 max함수를 이용하자...
            arr[i] = Math.min(arr[i], p);
        }

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Main010_self O = new Main010_self();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);

        O.solution(str, c);
    }
}
