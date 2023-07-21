package dfs.유형1_연결된요소찾기;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 트리의부모찾기_백준11725 {
    /**
     * [문제 링크]
     * https://www.acmicpc.net/problem/11725
     */
    final static int MAX = 100000 + 10;
    static boolean visited[];
    static ArrayList<Integer>[] graph;
    static int N;
    static int[] answer;

    public static void dfs(int idx) {
        visited[idx] = true;

        for(int i = 0; i < graph[idx].size(); i++) {
            int nextIndex = graph[idx].get(i);

            if(!visited[nextIndex]) {
                answer[nextIndex] = idx;
                dfs(nextIndex);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        graph = new ArrayList[MAX];
        for(int i = 0; i <= N ; i++) {
            graph[i] = new ArrayList<>();
        }

        visited = new boolean[MAX];
        answer = new int[MAX];

        for(int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        dfs(1);

        for(int i = 2; i <= N; i++) {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
