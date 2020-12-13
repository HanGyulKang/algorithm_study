package algorithm2020.month12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class baek_2108 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] arr = new int[N];
        int[] check = new int[8001];
        int sum = 0;

        for(int i=0 ; i<N ; i++){
            arr[i] =  Integer.parseInt(reader.readLine());
            // 최빈값 중 두 번째로 작은 값을 출력하기 위해 수가 몇 번 나왔는지 배열로 카운트
            check[arr[i]+4000]++;
            sum += arr[i];
        }

        //  ArrayList를 사용해 여러 개의 최빈값을 저장
        int maxIndex = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i<8001 ; i++){
            if(check[maxIndex] < check[i]){
                maxIndex = i;
                list.clear();
            }
            else if(check[i]!=0 && check[i]==check[maxIndex]){
                list.add(i-4000);
            }
        }

        Arrays.sort(arr);

        // 소수점 이하 첫째 자리에서 반올림
        System.out.println((int)Math.round((double)sum/N));
        System.out.println(arr[N/2]);
        if(list.size()!=0)
            System.out.println(list.get(0));
        else
            System.out.println(maxIndex-4000);
        System.out.println(arr[N-1]-arr[0]);
    }
}

