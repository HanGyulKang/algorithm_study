package 무한반복.A0003;

import java.io.*;
import java.util.StringTokenizer;

public class 바닥장식 {

    final static char VERTICAL = '|';
    final static char HORIZONTAL = '-';
    final static char CHECKED = 'x';

    static char[][] map;
    static int ROW, COL;
    static int answer;

    static 바닥장식.바닥장식util util = new 바닥장식.바닥장식util();

    static class 바닥장식util {
        boolean isHorizontal(char current, char next) {
            return current == HORIZONTAL && next == HORIZONTAL;
        }

        boolean isVertical(char current, char next) {
            return current == VERTICAL && next == VERTICAL;
        }

        boolean isAlreadyChecked(char floor) {
            return floor == CHECKED;
        }
    }

    public static void dfs(int row, int col) {
        char currentFloor = map[row][col];
        map[row][col] = CHECKED;

        char nextHorizontalValue = map[row][col + 1];
        char nextVerticalValue = map[row + 1][col];

        if (util.isHorizontal(currentFloor, nextHorizontalValue)) {
            dfs(row, col + 1);
        }

        if (util.isVertical(currentFloor, nextVerticalValue)) {
            dfs(row + 1, col);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        ROW = Integer.parseInt(st.nextToken());
        COL = Integer.parseInt(st.nextToken());

        map = new char[ROW + 2][COL + 2];
        for (int i = 1; i <= ROW; i++) {
            String floor = br.readLine();

            for (int j = 1; j <= COL; j++) {
                map[i][j] = floor.charAt(j - 1);
            }
        }

        answer = 0;
        for (int i = 1; i <= ROW; i++) {
            for (int j = 1; j <= COL; j++) {
                if (!util.isAlreadyChecked(map[i][j])) {
                    answer++;
                    dfs(i, j);
                }
            }
        }

        bw.write(String.valueOf(answer));
        br.close();
        bw.close();
    }
}
