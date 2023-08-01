package 무한반복.A0001;

import java.io.*;
import java.util.StringTokenizer;

public class 침투 {
    static String answer;
    static int M, N;
    static int buffer = 10;
    static boolean[][] map;
    static boolean[][] visited;
    static int[] dirX = {0, 0, 1, -1};
    static int[] dirY = {-1, 1, 0, 0};


    public static void dfs(int row, int col) {
        visited[row][col] = true;

        if (row == M) {
            answer = "YES";
            return;
        }

        for(int i = 0; i < dirX.length; i++) {
            int newX = dirX[i] + row;
            int newY = dirY[i] + col;

            if(!visited[newX][newY] && map[newX][newY]) {
                dfs(newX, newY);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new boolean[M + buffer][N + buffer];
        visited = new boolean[M + buffer][N + buffer];

        for (int i = 1; i <= M; i++) {
            String str = br.readLine();
            for (int j = 1; j <= N; j++) {
                map[i][j] = (str.charAt(j - 1)) == '0';
            }
        }

        answer = "NO";
        for(int i = 1; i <= N; i++) {
            if(!visited[1][i] && map[1][i]) {
                dfs(1, i);
            }
        }

        bw.write(answer);
        br.close();
        bw.close();
    }
}
