package 무한반복.A0001;

import java.io.*;
import java.util.StringTokenizer;

public class 촌수계산 {

    static int N, M, start, end;
    static boolean[][] graph;
    static boolean[] visited;
    static int answer;


    public static void dfs(int index, int count) {
        visited[index] = true;

        if(index == end) {
            answer = count;
            return;
        }

        for(int i = 1; i <= N; i++) {
            if(!visited[i] && graph[index][i]) {
                dfs(i, count + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        M = Integer.parseInt(br.readLine());

        graph = new boolean[N + 10][N + 10];
        visited = new boolean[N + 10];
        int x, y;
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        answer = -1;
        dfs(start, 0);

        bw.write(String.valueOf(answer));
        br.close();
        bw.close();
    }
}
