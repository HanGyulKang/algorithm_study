package 무한반복.A0004;

import java.io.*;
import java.util.StringTokenizer;

public class 쩜프왕젤리 {

    private enum Result {
        SUCCESS("HaruHaru"),
        FAIL("Hing");

        Result(String message) {
            this.message = message;
        }

        private String getMessage() {
            return this.message;
        }

        final String message;
    }

    private enum Components {
        BUFFER_SIZE(102),
        START_POINT(1),
        GOAL(-1),
        DEAD(0);

        Components(int value) {
            this.value = value;
        }

        private int getValue() {
            return this.value;
        }

        final int value;
    }

    private static int dataSize;
    private static int[][] map;
    private static String answer = Result.FAIL.getMessage();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        map = initializeMapSize(br.readLine());

        for (int i = 1; i <= dataSize; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= dataSize; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        jump(Components.START_POINT.getValue(), Components.START_POINT.getValue());

        bw.write(answer);
        br.close();
        bw.close();
    }

    private static void jump(int row, int column) {
        int point = map[row][column];

        if (point == Components.GOAL.getValue()) {
            answer = Result.SUCCESS.getMessage();
            return;
        }

        if (point == Components.DEAD.getValue()) {
            return;
        }

        int newRow = row + point;
        int newColumn = column + point;
        jump(row, newColumn);
        jump(newRow, column);
    }

    private static int[][] initializeMapSize(String input) {
        dataSize = Integer.parseInt(input);
        return new int[dataSize + Components.BUFFER_SIZE.getValue()][dataSize + Components.BUFFER_SIZE.getValue()];
    }
}
