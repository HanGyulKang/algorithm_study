package 무한반복.A0000;

import java.io.*;
import java.util.StringTokenizer;

public class 유기농배추 {
    final static int MAX = 50 + 10;
    static int M, N, K;
    static boolean[][] map;
    static boolean[][] visited;

    static int dirX[] = {0, 0, 1, -1};
    static int dirY[] = {1, -1, 0, 0};
    static int dirCnt = 4;

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for(int i = 0; i < dirCnt; i++) {
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

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new boolean[MAX][MAX];
            visited = new boolean[MAX][MAX];

            for(int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x + 1][y + 1] = true;
            }

            int answer = 0;
            for (int j = 1; j <= M; j++) {
                for (int k = 1; k <= N; k++) {
                    if(map[j][k] && !visited[j][k]) {
                        answer++;
                        dfs(j, k);
                    }
                }
            }

            bw.write(String.valueOf(answer));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
