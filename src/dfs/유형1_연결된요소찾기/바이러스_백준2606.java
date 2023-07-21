package dfs.유형1_연결된요소찾기;

import java.io.*;
import java.util.StringTokenizer;

public class 바이러스_백준2606 {
    /**
     * [문제 링크]
     * https://www.acmicpc.net/problem/2606
     *
     * [정리]
     * dfs 문제 키워드가 나오는지? 연결, 네트워크, 노드 등등..
     * 서로 연결되었다는 정보를 어떻게 하나의 자료구조로 통합할까?
     * 이미 방문한 지점을 다시 방문하지 않으려면?
     */
    static int N;
    static int M;
    static boolean[][] graph;
    static boolean[] visited;
    static int answer;

    public static void dfs(int index) {
        // 처리하려는 인덱스 값을 받아서 처리
        // index = 방문한 컴퓨터 번호
        visited[index] = true;

        // dfs가 호출되었다는 것이 이미 연결되었다는 뜻이기 때문에 연결된 컴퓨터 수 증가
        answer++;

        for(int i = 1; i <= N; i++) {
            // 이미 방문 했는지, 지금 들어온 컴퓨터 번호랑(indx) 연결된 컴퓨터인지 확인
            if(!visited[i] && graph[index][i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        int size = N + 1;

        graph = new boolean[size][size];
        visited = new boolean[size];

        // 1. graph에 연결 정보 채우기
        int x;
        int y;
        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            // 연결정보 등록
            // x 가 y와 연결된 경우 true
            graph[x][y] = true;
            // 마찬가지로 y가 x랑 연결된 경우 true
            graph[y][x] = true;
        }

        // 2. dfs(재귀함수) 호출 = 1번 컴퓨터부터 시작
        dfs(1);

        // 3. 출력
        bw.write(String.valueOf(answer - 1));
        br.close();
        bw.close();
    }
}
