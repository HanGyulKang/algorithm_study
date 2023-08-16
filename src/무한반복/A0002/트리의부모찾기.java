package 무한반복.A0002;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 트리의부모찾기 {

    static int[] answer;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int N;


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
        int size = N + 10;
        graph = new ArrayList[size];
        visited = new boolean[size];
        answer = new int[size];

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

        dfs(1);

        for(int i = 2; i <= N; i++) {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
