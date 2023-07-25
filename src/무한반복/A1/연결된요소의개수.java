package 무한반복.A1;

import java.io.*;
import java.util.StringTokenizer;

public class 연결된요소의개수 {

    static boolean graph[][];
    static boolean visited[];
    static int answer;
    static int N,M;

    static void dfs(int idx) {
        visited[idx] = true;

        for(int i = 1; i <= N; i++) {
            if(!visited[i] && graph[idx][i]) {
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

        int u, v;
        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            graph[u][v] = true;
            graph[v][u] = true;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print((graph[i][j] == true ? 1 : 0) + "\t");
            }
            System.out.println();
        }

        for(int i = 1; i <= N; i++) {
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