package 무한반복.A0001;

import java.io.*;
import java.util.StringTokenizer;

public class 유기농배추1 {
    static int T, M, N, K;
    static boolean[][] map;
    static boolean[][] visited;
    static int[] dirX = {0, 0, 1, -1};
    static int[] dirY = {-1, 1, 0, 0};

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i = 0; i < dirX.length; i++) {
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

        T = Integer.parseInt(br.readLine());

        int count = 0;
        while(count < T) {
            int answer = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new boolean[N + 10][M + 10];
            visited = new boolean[N + 10][M + 10];

            int x, y;
            for(int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                y = Integer.parseInt(st.nextToken());
                x = Integer.parseInt(st.nextToken());
                map[x + 1][y + 1] = true;
            }

            for(int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    if(!visited[i][j] && map[i][j]) {
                        dfs(i, j);
                        answer++;
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
