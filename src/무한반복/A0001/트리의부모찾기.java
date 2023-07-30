package 무한반복.A0001;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 트리의부모찾기 {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] answer;
    static int N;


    public static void dfs(int index) {
        visited[index] = true;

        for(int i = 0; i < graph[index].size(); i++) {
            int next = graph[index].get(i);

            if(!visited[next]) {
                answer[next] = index;
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());

        graph = new ArrayList[N + 10];
        for(int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        visited = new boolean[N + 10];

        int n, m;
        for(int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            graph[n].add(m);
            graph[m].add(n);
        }

        answer = new int[N + 10];
        dfs(1);

        for(int i = 2; i <= N; i++) {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}