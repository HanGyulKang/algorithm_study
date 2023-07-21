package basic.InflearnJavaClass2021.class02_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main016_self {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        int num = 1;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            temp = temp + num;
            num = temp - num;
            answer.add(i, temp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main016_self T = new Main016_self();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for(int i : T.solution(n)) {
            System.out.print(i + " ");
        }
    }
}
