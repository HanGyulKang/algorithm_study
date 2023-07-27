package 무한반복.A0000;

import java.io.*;
import java.util.StringTokenizer;

public class 바닥장식 {

    static int[][] map;
    static int N, M;
    static int answer;


    public static void dfs(int y, int x) {
        // - : 45, | : 124
        if(map[y][x] == 45 && map[y][x + 1] == 45) {
            dfs(y, x + 1);
        }

        if(map[y][x] == 124 && map[y + 1][x] == 124) {
            dfs(y + 1, x);
        }

        map[y][x] = 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N + 2][M + 2];

        for(int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= M; j++) {
                map[i][j] = str.charAt(j - 1);
            }
        }

        for(int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if(map[i][j] == 45 || map[i][j] == 124) {
                    dfs(i, j);
                    answer++;
                }
            }
        }

        bw.write(String.valueOf(answer));
        br.close();
        bw.close();
    }
}
