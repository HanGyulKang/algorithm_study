package 무한반복.A0001;

import java.io.*;
import java.util.StringTokenizer;

public class 바닥장식 {

    static int N, M;
    static char[][] map;
    static boolean[][] visited;
    static int answer;


    public static void dfs(int row, int col) {
        visited[row][col] = true;
        char floor = map[row][col];

        if(floor == '-' && map[row][col + 1] == '-') {
            dfs(row, col + 1);
        }

        if(floor == '|' && map[row + 1][col] == '|') {
            dfs(row + 1, col);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new char[N + 10][M + 10];
        visited = new boolean[N + 10][M + 10];

        for(int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < M; j++) {
                map[i + 1][j + 1] = str.charAt(j);
            }
        }

        for(int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if(!visited[i][j]) {
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
