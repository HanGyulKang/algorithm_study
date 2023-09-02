package 무한반복.A0004;

import java.io.*;
import java.util.StringTokenizer;

public class 연결요소의개수 {

    static int N, M;
    static boolean[][] graph;
    static boolean[] visited;
    static int answer;


    private static void dfs(int index) {
        visited[index] = true;

        for (int i = 1; i <= N; i++) {
            if(!visited[i] && graph[index][i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int size = N + 1;
        graph = new boolean[size][size];
        visited = new boolean[size];

        int u, v;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            graph[u][v] = true;
            graph[v][u] = true;
        }

        answer = 0;
        for (int i = 1; i <= N; i++) {
            if(!visited[i]) {
                answer++;
                dfs(i);
            }
        }


        bw.write(String.valueOf(answer));
        br.close();
        bw.close();
    }
}
