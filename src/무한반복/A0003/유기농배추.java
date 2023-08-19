package 무한반복.A0003;

import java.io.*;
import java.util.StringTokenizer;

public class 유기농배추 {

    final static int BUFFER = 2;
    final static int[] DIRECTION_ROW = {0, 0, 1, -1};
    final static int[] DIRECTION_COL = {1, -1, 0, 0};

    static int LOOP, COL, ROW, COUNT;
    static boolean[][] map;


    public static void dfs(int row, int col) {
        map[row][col] = false;

        for (int i = 0; i < DIRECTION_ROW.length; i++) {
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

        LOOP = Integer.parseInt(br.readLine());
        int count = 0;

        while (count < LOOP) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            COL = Integer.parseInt(st.nextToken());
            ROW = Integer.parseInt(st.nextToken());
            COUNT = Integer.parseInt(st.nextToken());

            map = new boolean[ROW + BUFFER][COL + BUFFER];

            int row, col;
            for (int i = 0; i < COUNT; i++) {
                st = new StringTokenizer(br.readLine());

                col = Integer.parseInt(st.nextToken()) + 1;
                row = Integer.parseInt(st.nextToken()) + 1;
                map[row][col] = true;
            }

            int answer = 0;
            for (int i = 1; i <= ROW; i++) {
                for (int j = 1; j <= COL; j++) {
                    if(map[i][j]) {
                        answer++;
                        dfs(i, j);
                    }
                }
            }

            bw.write(String.valueOf(answer));
            bw.newLine();
            count++;
        }

        br.close();
        bw.close();
    }
}
