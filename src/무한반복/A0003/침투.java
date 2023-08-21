package 무한반복.A0003;

import java.io.*;
import java.util.StringTokenizer;

public class 침투 {

    final static int BUFFER = 2;
    final static int[] DIRECTION_ROW = {0, 0, 1, -1};
    final static int[] DIRECTION_COL = {1, -1, 0, 0};

    static int ROW, COL;
    static boolean[][] map;
    static String answer;


    public static void dfs(int row, int col) {
        map[row][col] = false;

        if(row == ROW) {
            answer = "YES";
            return;
        }

        for (int i = 0; i < DIRECTION_COL.length; i++) {
            int newRow = row + DIRECTION_ROW[i];
            int newCol = col + DIRECTION_COL[i];

            if(map[newRow][newCol]) {
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

        map = new boolean[ROW + BUFFER][COL + BUFFER];

        for (int i = 1; i <= ROW; i++) {
            String data = br.readLine();

            for (int j = 1; j <= COL; j++) {
                map[i][j] = data.charAt(j - 1) == '0';
            }
        }

        answer = "NO";
        for (int i = 1; i <= COL; i++) {
            if(map[1][i]) {
                dfs(1, i);
            }
        }

        bw.write(answer);
        br.close();
        bw.close();
    }
}
