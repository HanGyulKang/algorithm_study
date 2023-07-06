package basic.InflearnJavaClass2021.class02_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main018_self {
    public boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }

        // 1과 자기 자신을 제외한 나머지 숫자로 소수 판별 : 나누어 떨어지면 소수x
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int res = 0;

            // 숫자 뒤집는 공식
            while(temp > 0) {
                int t = temp % 10;
                res = res * 10 + t;
                temp = temp / 10;
            }

            // 이미 해당 메소드를 호출할 때 해당 클래스 객체가 선언되어 있기 때문에 static 메소드가 아니어도 호출 가능
            if(isPrime(res)) {
                answer.add(res);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        Main018_self T = new Main018_self();
        for(int x : T.solution(arr)) {
            System.out.print(x + " ");
        }
    }
}
