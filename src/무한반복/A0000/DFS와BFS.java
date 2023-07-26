package 무한반복.A0000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DFS와BFS {
    final static int MAX = 1000 + 10;
    static boolean graph[][];
    static boolean visited[];
    static ArrayList<Integer> queue;
    static int N, M, V;

    static void bfs() {
        visited = new boolean[MAX];
        queue = new ArrayList<>();

        visited[V] = true;
        queue.add(V);

        while(!queue.isEmpty()) {
            int idx = queue.remove(0);
            System.out.print(idx + " ");

            for (int i = 1; i <= N; i++) {
                if(!visited[i] && graph[idx][i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    static void dfs(int idx) {
        visited[idx] = true;
        System.out.print(idx + " ");

        for(int i = 1; i <= N; i++) {
            if(!visited[i] && graph[idx][i]) {
                dfs(i);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];

        int x, y;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        dfs(V);
        bfs();
    }
}
