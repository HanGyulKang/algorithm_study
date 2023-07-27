package dfs.유형2_같은부류찾기;

import java.io.*;
import java.util.StringTokenizer;

public class 바닥장식_백준1388 {
    /**
     * [문제 링크]
     * https://www.acmicpc.net/problem/1388
     */
    static char[][] map;
    static boolean[][] visited;
    static int N, M;


    static void dfs(int y, int x) {
        visited[y][x] = true;

        if(map[y][x] == '-' && map[y][x + 1] == '-') {
            dfs(y, x + 1);
        }

        if(map[y][x] == '|' && map[y + 1][x] == '|') {
            dfs(y + 1, x);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new char[N + 2][M + 2];
        visited = new boolean[N + 2][M + 2];

        // 1. map정보 반영
        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= M; j++) {
                map[i][j] = str.charAt(j - 1);
            }
        }
        
        // 2. dfs 수행
        int answer = 0;
        for(int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if(!visited[i][j]) {
                    dfs(i, j);
                    answer++;
                }
            }
        }
        
        // 3. 출력
        bw.write(String.valueOf(answer));

        br.close();
        bw.close();
    }
}



