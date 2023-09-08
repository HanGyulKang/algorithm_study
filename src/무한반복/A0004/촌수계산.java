package 무한반복.A0004;

import java.io.*;
import java.util.StringTokenizer;

public class 촌수계산 {

    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int start, end;
    static int answer;


    public static void dfs(int idx, int count) {
        visited[idx] = true;
        if(idx == end) {
            answer = count;
            return;
        }

        for(int i = 1; i <= N; i++) {
            if(!visited[i] && graph[idx][i]) {
                dfs(i, count + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        M = Integer.parseInt(br.readLine());
        int size = N + 2;

        graph = new boolean[size][size];
        visited = new boolean[size];
        answer = 0;

        int x, y;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            graph[x][y] = true;
            graph[y][x] = true;
        }

        dfs(start, 0);

        bw.write(String.valueOf(answer - 1));
        br.close();
        bw.close();
    }
}
