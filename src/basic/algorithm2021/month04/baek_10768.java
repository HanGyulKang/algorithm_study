package basic.algorithm2021.month04;

import java.util.Scanner;

public class baek_10768 {
    private static final int STANDARD = 218;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.next();
        String day = scan.next();

        int date = Integer.parseInt(month + (day.length() == 1 ? "0" + day : day));

        if(STANDARD == date) {
            System.out.println("Special");
        } else if(STANDARD > date) {
            System.out.println("Before");
        } else {
            System.out.println("After");
        }

    }
}
