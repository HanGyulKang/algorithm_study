package 무한반복.A0003;

import java.io.*;
import java.util.StringTokenizer;

public class 촌수계산 {

    final static int BUFFER = 1;
    static int N, M;
    static int start, end;
    static boolean[][] graph;
    static boolean[] visited;
    static int answer;


    public static void dfs(int index, int count) {
        visited[index] = true;
        if(index == end) {
            answer = count;
            return;
        }

        count++;
        for (int i = 1; i <= N; i++) {
            if(!visited[i] && graph[index][i]) {
                dfs(i, count);
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

        int size = N + BUFFER;
        graph = new boolean[size][size];
        visited = new boolean[size];

        int x, y;
        for (int i = 0; i < M; i++) {
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
