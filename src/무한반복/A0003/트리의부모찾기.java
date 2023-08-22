package 무한반복.A0003;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 트리의부모찾기 {

    static int N, M;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int[] answer;


    public static void dfs(int index) {
        visited[index] = true;

        for (int i = 0; i < graph[index].size(); i++) {
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
        M = N - 1;

        int size = N + 1;
        graph = new ArrayList[size];
        visited = new boolean[size];
        answer = new int[size];

        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        int x, y;
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            graph[x].add(y);
            graph[y].add(x);
        }

        dfs(1);
        for (int i = 2; i <= N; i++) {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
