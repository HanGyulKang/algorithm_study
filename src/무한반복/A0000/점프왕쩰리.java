package 무한반복.A0000;

import java.io.*;
import java.util.StringTokenizer;

public class 점프왕쩰리 {
    /**
     * [문제 링크]
     * https://www.acmicpc.net/problem/16173
     */
    static int[][] map;
    static boolean[][] visited;
    static int N;
    static int answer = 0;
    static int[] dirY = {1, 0};
    static int[] dirX = {0, 1};

    public static void dfs(int y, int x) {
        visited[y][x] = true;

        if(map[y][x] == -1) {
            answer = map[y][x];
            return;
        }

        for(int i = 0; i < dirY.length; i++) {
            int point = map[y][x];
            int newY = y + dirY[i] * point;
            int newX = x + dirX[i] * point;

            if(!visited[newY][newX]) {
                dfs(newY, newX);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        int size = N + 110;
        map = new int[size][size];
        visited = new boolean[size][size];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(1, 1);

        bw.write(answer == -1 ? "HaruHaru" : "Hing");
        bw.close();
        br.close();
    }
}
