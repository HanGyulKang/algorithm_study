package algorithm2021.month03;

public class baek_5893 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("10110111").reverse();
        String str = sb.toString();

        int num = 1;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i) - '0') == 1) {
                sum += num;
            }
            num *= 2;
        }
        System.out.println(sum * 17);
        System.out.println(Integer.toBinaryString(sum * 17));
    }
}
