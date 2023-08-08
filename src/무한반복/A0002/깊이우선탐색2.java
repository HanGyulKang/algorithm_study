package 무한반복.A0002;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 깊이우선탐색2 {

    static int N, M, R;
    static int order;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] answer;

    public static void dfs(int index) {
        visited[index] = true;
        answer[index] = order;
        order++;

        for (int i = 0; i < graph[index].size(); i++) {
            int next = graph[index].get(i);

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

        int size = N + 2;
        graph = new ArrayList[size];
        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        visited = new boolean[size];
        answer = new int[size];

        int u, v;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i], Collections.reverseOrder());
        }

        order = 1;
        dfs(R);

        for (int i = 1; i <= N; i++) {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
