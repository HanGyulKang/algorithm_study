package 무한반복.A0002;

import java.io.*;
import java.util.StringTokenizer;

public class 침투 {
    static int ROW, COL;
    static int[][] map;
    static String answer = "NO";

    static int[] directionRow = {1, -1, 0, 0};
    static int[] directionCol = {0, 0, 1, -1};

    public static void dfs(int row, int col) {
        map[row][col] = 0;

//        System.out.println(String.format("row : %s, col : %s", row, col));

        if(row == ROW) {
            answer = "YES";
            return;
        }

        for (int i = 0; i < directionRow.length; i++) {
            int newRow = row + directionRow[i];
            int newCol = col + directionCol[i];

            if(map[newRow][newCol] == 1) {
                dfs(newRow, newCol);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        ROW = Integer.parseInt(st.nextToken());
        COL = Integer.parseInt(st.nextToken());

        int rowSize = ROW + 10;
        int colSize = COL + 10;
        map = new int[rowSize][colSize];

        for (int i = 1; i <= ROW ; i++) {
            String isNotBlocked = br.readLine();

            for (int j = 1; j <= COL; j++) {
                map[i][j] = isNotBlocked.charAt(j - 1) == '0' ? 1 : 0;
            }
        }

        for (int i = 1; i <= COL; i++) {
            if(map[1][i] == 1) {
                dfs(1, i);
            }
        }

        bw.write(answer);
        br.close();
        bw.close();
    }
}
