package 무한반복.A0000;

import java.io.*;
import java.util.StringTokenizer;

public class 섬의개수 {
    /**
     * [문제 링크]
     * https://www.acmicpc.net/problem/4963
     */
    static boolean[][] graph;
    static int dirY[] = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int dirX[] = {0, 1, 1, 1, 0, -1, -1, -1};
    static int answer;
    static int MAX = 50 + 10;
    static int N, M;

    static void dfs(int y, int x) {
        graph[y][x] = false;

        for (int i = 0; i < dirX.length; i++) {
            int newY = y + dirY[i];
            int newX = x + dirX[i];

            if(graph[newY][newX]) {
                dfs(newY, newX);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            // 변수 선언
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 행 개수
            N = Integer.parseInt(st.nextToken()); // 각 열의 요소 개수

            if(N == 0 && M == 0) {
                break;
            }

            // 그래프 초기화 및 데이터 입력
            graph = new boolean[MAX][MAX];
            for(int i = 1; i <= N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= M; j++) {
                    graph[i][j] = Integer.parseInt(st.nextToken()) == 1;
                }
            }

            // dfs호출
            answer = 0;
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    if(graph[i][j]) {
                        dfs(i, j);
                        answer++;
                    }
                }
            }

            bw.write(String.valueOf(answer));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
