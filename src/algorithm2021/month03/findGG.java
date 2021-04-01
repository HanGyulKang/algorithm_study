package algorithm2021.month03;

public class findGG {
    public static boolean gHappy(String str) {
        if(str.length() == 2) {
            return "gg".equals(str) ? true : false;
        }
        if("".equals(str)) {
            return true;
        }

        int cnt = 0;
        int size = 0;
        int[] arr = new int[10];
        for(int i = 0; i < str.length(); i++) {
            if('g' == str.charAt(i)) {
                cnt++;
            }
            if('g' != str.charAt(i)) {
                arr[size] = cnt;
                cnt = 0;
                size++;
            }
            if(i == str.length() - 1) {
                if(str.charAt(i) == 'g') {
                    arr[size] = cnt;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(gHappy("xxgggxyg"));
    }

}
