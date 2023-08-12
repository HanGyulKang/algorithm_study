package 무한반복.A0002;

import java.io.*;
import java.util.StringTokenizer;

public class 쩜프왕쩰리 {

    static int[][] map;
    static boolean[][] visited;
    static String answer;


    public static void dfs(int row, int col) {
        visited[row][col] = true;
        int point = map[row][col];

        if(point == -1) {
            answer = "HaruHaru";
            return;
        }

        int newRow = row + point;
        int newCol = col + point;

        if(!visited[newRow][col] && map[newRow][col] != 0) {
            dfs(newRow, col);
        }

        if(!visited[row][newCol] && map[row][newCol] != 0) {
            dfs(row, newCol);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int size = n + 110;
        int loop = 3;

        map = new int[size][size];
        visited = new boolean[size][size];

        for (int i = 1; i <= loop; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= loop; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        answer = "Hing";
        dfs(1, 1);

        bw.write(answer);
        bw.close();
        br.close();
    }
}
