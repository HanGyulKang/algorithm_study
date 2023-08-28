package 무한반복.A0004;

import java.io.*;
import java.util.StringTokenizer;

public class 바닥장식 {

    final static int BUFFER = 2;
    final static char VISITED = 'x';
    final static char LEFT = '-';
    final static char DOWN = '|';

    static int ROW, COL;
    static char[][] map;
    static int answer;


    public static void dfs(int row, int col) {
        char currentValue = map[row][col];
        map[row][col] = VISITED;

        if(currentValue == LEFT && map[row][col + 1] == LEFT) {
            dfs(row, col + 1);
        }

        if(currentValue == DOWN && map[row + 1][col] == DOWN) {
            dfs(row + 1, col);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        ROW = Integer.parseInt(st.nextToken());
        COL = Integer.parseInt(st.nextToken());

        int rowSize = ROW + BUFFER;
        int colSize = COL + BUFFER;

        map = new char[rowSize][colSize];
        for (int i = 1; i <= ROW; i++) {
            String floor = br.readLine();
            for (int j = 1; j <= COL; j++) {
                map[i][j] = floor.charAt(j - 1);
            }
        }

        for (int i = 1; i <= ROW; i++) {
            for (int j = 1; j <= COL; j++) {
                if(map[i][j] != VISITED) {
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
