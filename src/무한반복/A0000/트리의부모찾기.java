package 무한반복.A0000;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 트리의부모찾기 {
    static ArrayList<Integer>[] graph;
    static boolean visited[];
    static int answer[];
    static int N;


    static void dfs(int idx) {
        visited[idx] = true;

        for(int i = 0; i < graph[idx].size(); i++) {
            int next = graph[idx].get(i);

            if(!visited[next]) {
                answer[next] = idx;
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        graph = new ArrayList[N + 1];
        for(int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        int x, y;
        for(int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        visited = new boolean[N + 1];
        answer = new int[N + 1];

        dfs(1);

        for(int i = 2; i <= N; i++) {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
