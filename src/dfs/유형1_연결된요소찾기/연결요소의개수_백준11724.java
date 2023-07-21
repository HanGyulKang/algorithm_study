package dfs.유형1_연결된요소찾기;

import java.io.*;
import java.util.StringTokenizer;

public class 연결요소의개수_백준11724 {
    /**
     * [문제 링크]
     * https://www.acmicpc.net/problem/11724
     *
     * [문제 요약]
     * 방향 없는 그래프가 주어졌을 때, 연결 요소(Connected Component)의 개수를 구하는 프로그램을 작성하시오
     * N:요소의 개수(5 <= N <= 1000)
     *
     * [키워드]
     * 연결 또는 연결 요소
     *
     * [설명]
     * 방향 없는 그래프 = 2차원 배열 그래프, 양방향 그래프
     * 방향 있는 그래프 = 1차원 배열, 한 줄짜리 그래프
     *
     * [정리]
     * 연결된 요소의 개수 -> DFS / BFS
     * 서로 연결되었다는 정보를 어떻게 하나의 자료구조로 통합할까?
     * 이미 방문한 지점을 다시 방문하지 않으려면 어떤 자료구조를 사용해야 될까?
     * 어디에서 DFS를 시작할 것인가?
     */

    final static int MAX = 1000 + 10;
    static boolean graph[][];
    static boolean visited[];
    static int N, M;
    static int answer;

    static void dfs(int index) {
        // index = 요소 번호
        visited[index] = true; // 이미 방문한 것 표시

        for (int i = 1; i <= N; i++) {
            if(!visited[i] && graph[index][i]) { // 방문한 적 없고 연결 요소가 있는 경우 재귀 호출
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 요소의 개수
        M = Integer.parseInt(st.nextToken()); // 간선 개수

        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];

        // 1. graph에 연결 정보 초기화
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine()); // 입력 값을 공백으로 나눔
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = true;
            graph[v][u] = true;
        }

        /** [start] 핵심 로직 */
        // 2. dfs(재귀함수 호출)
        for(int i = 1; i <= N; i++) {
            // 아직 방문하지 않은 곳이 있을 경우 실행
            if(!visited[i]) {
                dfs(i);

                // 아직 방문하지 않은 곳이 있다는건 아무튼 연결된 덩어리가 있다는 것이기 때문에
                // 덩어리 개수(=연결요소 개수) 증가
                answer++;
            }
        }
        /** [end] 핵심 로직 */

        // 3. 출력
        bw.write(String.valueOf(answer));
        br.close();
        bw.close();
    }
}
