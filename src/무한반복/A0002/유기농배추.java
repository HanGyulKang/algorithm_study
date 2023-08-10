package 무한반복.A0002;

import java.io.*;
import java.util.StringTokenizer;

public class 유기농배추 {

    static int T, COL, ROW, K;
    static boolean[][] map;
    static int answer;

    final static int DIRECTION = 4;
    static int[] dirRow = {0,0,1,-1};
    static int[] dirCol = {-1,1,0,0};


    public static void dfs(int row, int col) {
        map[row][col] = false;

        for (int i = 0; i < DIRECTION; i++) {
            int newRow = row + dirRow[i];
            int newCol = col + dirCol[i];

            if(map[newRow][newCol]) {
                dfs(newRow, newCol);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());
        int processCount = 0;

        while(processCount < T) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            COL = Integer.parseInt(st.nextToken());
            ROW = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            int colSize = COL + 10;
            int rowSize = ROW + 10;

            map = new boolean[rowSize][colSize];
            int y, x;
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                y = Integer.parseInt(st.nextToken()) + 1;
                x = Integer.parseInt(st.nextToken()) + 1;

                map[x][y] = true;
            }

            answer = 0;
            for (int i = 1; i <= ROW; i++) {
                for (int j = 1; j <= COL; j++) {
                    if(map[i][j]) {
                        answer++;
                        dfs(i, j);
                    }
                }
            }

            processCount++;

            bw.write(String.valueOf(answer));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
