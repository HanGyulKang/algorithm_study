package algorithm2020.month11;

import java.util.Scanner;

public class baek_5622 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int total = 0;

        for (int i = 0; i < str.length(); i++) {
            String setStr = str.charAt(i) + "";
            if("A".equals(setStr) || "B".equals(setStr) || "C".equals(setStr)) {
                total += 3;
            } else if("D".equals(setStr) || "E".equals(setStr) || "F".equals(setStr)) {
                total += 4;
            } else if("G".equals(setStr) || "H".equals(setStr) || "I".equals(setStr)) {
                total += 5;
            } else if("J".equals(setStr) || "K".equals(setStr) || "L".equals(setStr)) {
                total += 6;
            } else if("M".equals(setStr) || "N".equals(setStr) || "O".equals(setStr)) {
                total += 7;
            } else if("P".equals(setStr) || "Q".equals(setStr) || "R".equals(setStr) || "S".equals(setStr)) {
                total += 8;
            } else if("T".equals(setStr) || "U".equals(setStr) || "V".equals(setStr)) {
                total += 9;
            } else if("W".equals(setStr) || "X".equals(setStr) || "Y".equals(setStr) || "Z".equals(setStr)) {
                total += 10;
            } else {
                total += 11;
            }
        }
        System.out.println(total);
    }
}
