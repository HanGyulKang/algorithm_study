package 무한반복.A1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 깊이우선탐색1 {
    /**
     * 기존 풀이방식대로 풀었을 경우 MAX치를 문제에서 제시한 100000 건으로 
     * ArrayList 객체를 생성하다보니 RuntimeError가 발생
     * ---------
     * 입력 데이터에서 제공해주는 정점의 수, 간선의 수를 받아 객체를 생성하는 것으로 해결
     */
    
    static int N, M, S;
    static ArrayList<Integer>[] graph;
    static boolean visited[];
    static int answer[];
    static int order;

    static void dfs(int idx) {
        visited[idx] = true; // 방문 여부 체크
        answer[idx] = order++; // 들어온 인덱스에 순서 입력

        for (int i = 0; i < graph[idx].size(); i++) {
            int next = graph[idx].get(i);

            if(!visited[next]) { // 다음 노드가 아직 방문하지 않은 곳이라면...
                // 재귀호출
                dfs(next);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 정점 수
        M = Integer.parseInt(st.nextToken()); // 간선 개수
        // 시작 번호
        S = Integer.parseInt(st.nextToken());

        // 정점들을 물고 정점별로 연결된 점을 소유
        graph = new ArrayList[N + 1];
        for(int i = 0; i <= N; i++) {
            // 정점 수만큼 초기화
            graph[i] = new ArrayList<>();
        }

        answer = new int[N + 1];
        visited = new boolean[N + 1];
        order = 1;

        // 간선 개수만큼 그래프 초기화
        int u, v;
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        // 오름차순으로 방문하기 위한 오름차순 정렬
        for(int i = 0; i < graph.length; i++) {
            Collections.sort(graph[i]);
        }

        dfs(S);

        for(int i = 0; i < N; i++) {
            bw.write(String.valueOf(answer[i + 1]));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
