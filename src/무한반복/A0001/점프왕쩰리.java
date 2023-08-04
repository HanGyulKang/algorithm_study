package 무한반복.A0001;

import java.io.*;
import java.util.StringTokenizer;

public class 점프왕쩰리 {

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

        if(!visited[row + point][col] && map[row + point][col] != 0) {
            dfs(row + point, col);
        }

        if(!visited[row][col + point] && map[row][col + point] != 0) {
            dfs(row, col + point);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        map = new int[n + 110][n + 110];
        visited = new boolean[n + 110][n + 110];

        for (int i = 1; i < n + 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j < n + 1; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        answer = "Hing";
        dfs(1, 1);

        bw.write(answer);
        br.close();
        bw.close();
    }
}
