package 무한반복.A0002;

import java.io.*;
import java.util.StringTokenizer;

public class 촌수계산 {

    static int start, end, n, m;
    static boolean[][] graph;
    static boolean[] visited;
    static int answer;


    public static void dfs(int index, int count) {
        visited[index] = true;
        if(index == end) {
            answer = count;
            return;
        }

        for (int i = 1; i <= n; i++) {
            if(!visited[i] && graph[index][i]) {
                dfs(i, count + 1);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        int size = n + 10;
        graph = new boolean[size][size];
        visited = new boolean[size];

        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(br.readLine());

        int x, y;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            graph[x][y] = true;
            graph[y][x] = true;
        }

        dfs(start, 0);

        bw.write(String.valueOf(answer));
        br.close();
        bw.close();
    }
}
