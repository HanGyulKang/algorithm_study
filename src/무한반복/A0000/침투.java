package 무한반복.A0000;

import java.io.*;
import java.util.StringTokenizer;

public class 침투 {
    static int M, N;
    static boolean[][] map;
    static boolean[][] visited;
    static int[] dirX = {0, 0, 1, -1};
    static int[] dirY = {-1, 1, 0, 0};
    static String answer;


    public static void dfs(int x, int y) {
        visited[x][y] = true;

        if(x == M) {
            answer = "YES";
            return;
        }

        for (int i = 0; i < dirX.length; i++) {
            int newX = x + dirX[i];
            int newY = y + dirY[i];

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

        map = new boolean[M + 2][N + 2];
        visited = new boolean[M + 2][N + 2];

        for (int i = 1; i <= M; i++) {
            String str = br.readLine();

            for (int j = 1; j <= N; j++) {
                map[i][j] = (str.charAt(j - 1) - 48) == 0;
            }
        }

        answer = "NO";
        for(int i = 1; i <= N; i++) {
            if(!visited[1][i] && map[1][i]) {
                dfs(1, i);
            }
        }

        bw.write(answer);
        bw.close();
        br.close();
    }
}
