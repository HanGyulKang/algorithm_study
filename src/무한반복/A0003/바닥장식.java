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


    public static void dfs(int row, int col) {
        char currentFloor = map[row][col];
        map[row][col] = CHECKED;

        if(currentFloor == HORIZONTAL && map[row][col + 1] == HORIZONTAL) {
            dfs(row, col + 1);
        }

        if(currentFloor == VERTICAL && map[row + 1][col] == VERTICAL) {
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
                if(map[i][j] != CHECKED) {
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
