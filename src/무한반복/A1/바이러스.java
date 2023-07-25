package 무한반복.A1;

import java.io.*;
import java.util.StringTokenizer;

public class 바이러스 {
    static int answer;
    static int N, M;
    static boolean[][] graph;
    static boolean[] visited;

    static void dfs(int computerNumber) {
        visited[computerNumber] = true;

        for(int i = 1; i < N; i++) {
            if(!visited[i] && graph[computerNumber][i]) {
                answer++;
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine()); // 컴퓨터 개수
        M = Integer.parseInt(br.readLine()); // 연결된 정보 개수

        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];
        answer = 0;

        // garph 정보를 입력
        int x, y;
        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        dfs(1);

        bw.write(String.valueOf(answer));
        br.close();
        bw.close();
    }
}
