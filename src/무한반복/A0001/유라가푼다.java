package 무한반복.A0001;

import java.io.*;
import java.util.StringTokenizer;

public class 유라가푼다 {
    final static int MAX = 1000 + 10;
    static boolean graph[][];

    // 재방문 방지
    static boolean visited[];
    static int N, M;
    static int answer;

    static void dfs(int idx) {
        visited[idx] = true; // 재방문 하지망
        for(int i = 1; i <= N; i++)
            if(visited[i] == false && graph[idx][i])
                dfs(i);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 점 개수
        M = Integer.parseInt(st.nextToken()); // 간선 정보

        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = true;
            graph[v][u] = true;
        }

        for(int i = 1; i <= N; i++) {
            if(visited[i] == false)
                dfs(i); // dfs가 한번 다 돌면 하나의 덩어리가 끝나는 것
                answer++;
        }

        bw.write(String.valueOf(answer));
        bw.close();
        br.close();
    }
}
