import java.util.Scanner;

public class DailyPractice {
    // 심심할 때 찍는 별
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();

        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();

        //     *
        //    **
        //   ***
        //  ****
        // *****
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j >= n - i - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        System.out.println();

        // *****
        //  ****
        //   ***
        //    **
        //     *
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j >= i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

    }
}
