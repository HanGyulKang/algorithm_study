package 무한반복.A0000;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 깊이우선탐색2 {
    static ArrayList<Integer>[] graph;
    static boolean visited[];
    static int answer[];
    static int N, M, R;
    static int order;

    static void dfs(int idx) {
        visited[idx] = true;
        answer[idx] = order++;

        for(int i = 0; i < graph[idx].size(); i++) {
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

        // 변수 정리(초기화)
        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        answer = new int[N + 1];
        order = 1;

        for(int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 수만큼 데이터 입력
        int u, v;
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        for(int i = 1; i < graph.length; i++) {
            Collections.sort(graph[i], Collections.reverseOrder());
        }

        dfs(R);

        // 결과 출력
        for(int i = 1; i <= N; i++) {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
