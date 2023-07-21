package dfs.유형1_연결된요소찾기;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 깊이우선탐색1_백준24479 {

    /**
     * [문제 링크]
     * https://www.acmicpc.net/problem/24479
     */

    final static int MAX = 1000000 + 10; // 10은 여유분
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int N, M, R;
    static int[] answer;
    static int order;

    public static void dfs(int idx) {
        visited[idx] = true;
        answer[idx] = order;
        order++;

        // 각 ArrayList마다 하나씩 뒤져보겠다.
        for (int i = 0; i < graph[idx].size(); i++) {
            int nextNode = graph[idx].get(i);
            if(!visited[nextNode]) {
                dfs(nextNode);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // 0. 입력 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        // 1. graph에 정보 채우기
        graph = new ArrayList[MAX];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }

        visited = new boolean[MAX];
        answer = new int[MAX];
        // 방문한 순서
        order = 1;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        // 2. 오름차순 정렬
        for (int i = 0; i < N; i++) {
            Collections.sort(graph[i]);
        }


        // 3. dfs(재귀함수 호출)
        dfs(R);

        // 4. 출력
        for(int i = 1; i <= N; i++) {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
