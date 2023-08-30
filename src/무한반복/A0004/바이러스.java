package 무한반복.A0004;

import java.io.*;
import java.util.StringTokenizer;

public class 바이러스 {

    final static int START = 1;
    static int N, M;
    static int answer;
    static boolean[][] graph;
    static boolean[] visited;


    public static void dfs(int index) {
        visited[index] = true;
        answer++;

        for (int i = 1; i <= N; i++) {
            if(!visited[i] && graph[index][i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        int size = N + 1;
        graph = new boolean[size][size];
        visited = new boolean[size];

        int x, y;
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            graph[x][y] = true;
            graph[y][x] = true;
        }

        dfs(START);

        bw.write(String.valueOf(answer - 1));
        br.close();
        bw.close();

    }
}
