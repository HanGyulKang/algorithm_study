package 무한반복.A0000;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 깊이우선탐색1 {
    final static int MAX = 200000 + 10;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] answer;
    static int order;
    static int N, M, R;

    static void dfs(int idx) {
        visited[idx] = true;
        answer[idx] = order++;

        for (int i = 0; i < graph[idx].size(); i++) {
            // 다음 방문 노드
            int next = graph[idx].get(i);

            if(!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        visited = new boolean[MAX];
        graph = new ArrayList[MAX];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }

        int u, v;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        for(int i = 0; i < N; i++) {
            Collections.sort(graph[i]);
        }

        answer = new int[MAX];
        order = 1;
        dfs(R);

        for(int i = 1; i <= N; i++) {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
