package 무한반복.A0003;

import java.io.*;
import java.util.StringTokenizer;

public class 섬의개수 {

    static int ROW, COL;
    static int[][] map;
    final static int[] DIRECTION_ROW = {0, 0, 1, -1, 1, 1, -1, -1};
    final static int[] DIRECTION_COL = {1, -1, 0, 0, -1, 1, -1, 1};


    public static void dfs(int row, int col) {
        map[row][col] = 0;

        for (int i = 0; i < DIRECTION_COL.length; i++) {
            int newRow = row + DIRECTION_ROW[i];
            int newCol = col + DIRECTION_COL[i];

            if(map[newRow][newCol] == 1) {
                dfs(newRow, newCol);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int answer = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());

            COL = Integer.parseInt(st.nextToken());
            ROW = Integer.parseInt(st.nextToken());

            if (COL + ROW == 0) {
                break;
            }

            map = new int[ROW + 2][COL + 2];
            for (int i = 1; i <= ROW; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 1; j <= COL; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 1; i <= ROW; i++) {
                for (int j = 1; j <= COL; j++) {
                    if (map[i][j] == 1) {
                        answer++;
                        dfs(i, j);
                    }
                }
            }

            bw.write(String.valueOf(answer));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
