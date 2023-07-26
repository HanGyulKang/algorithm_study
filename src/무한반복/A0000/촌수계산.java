package 무한반복.A0000;

import java.io.*;
import java.util.StringTokenizer;

public class 촌수계산 {
    final static int MAX = 100 + 10;
    static int N, M, A, B;
    static int answer;
    static boolean[][] graph;
    static boolean[] visited;


    static void dfs(int idx, int count) {
        // A -> B
        visited[idx] = true;

        if (idx == B) {
            answer = count;
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i] && graph[idx][i]) {
                dfs(i, count + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 데이터 정리
        N = Integer.parseInt(br.readLine()); // 사람 수
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken()); // 관계 A
        B = Integer.parseInt(st.nextToken()); // 관계 B

        M = Integer.parseInt(br.readLine()); // 행 개수

        // graph 채우기
        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];
        answer = -1;

        int x, y;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }


        dfs(A, 0);

        bw.write(String.valueOf(answer));
        br.close();
        bw.close();
    }
}
