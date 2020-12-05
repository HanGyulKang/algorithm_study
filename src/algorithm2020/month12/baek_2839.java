package algorithm2020.month12;

public class baek_2839 {
    public static void main(String[] args) {
        int a = 21;
        int i = 5;
        int j = 3;
        int res = 0;

        // 공식 찾아서 짜기
        if((a % i) - j == 0) {
            res += a / i;
            res += res / j;
        } else if (a % i == 0) {
            res += a / i;
        } else if (a % j == 0){
            res += a / j;
        } else {
            res = -1;
        }
        System.out.println(res);

    }
}
