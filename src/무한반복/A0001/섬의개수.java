package 무한반복.A0001;

import java.io.*;
import java.util.StringTokenizer;

public class 섬의개수 {

    final static int BUFFER = 10;

    static boolean[][] map;
    static boolean[][] visited;
    static int W, H;
    static int[] dirRow = {1,-1,0,0, 1,-1,1,-1};
    static int[] dirCol = {0,0,-1,1, 1,1,-1,-1};


    public static void dfs(int row, int col) {
        visited[row][col] = true;

        for(int i = 0; i < dirRow.length; i++) {
            int newRow = row + dirRow[i];
            int newCol = col + dirCol[i];

            if(!visited[newRow][newCol] && map[newRow][newCol]) {
                dfs(newRow, newCol);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());

            if(W == 0 && H == 0) {
                break;
            }

            int row = H + BUFFER;
            int col = W + BUFFER;
            map = new boolean[row][col];
            visited = new boolean[row][col];

            int x, y;
            for(int i = 1; i <= H; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 1; j <= W; j++) {
                    map[i][j] = (Integer.parseInt(st.nextToken())) == 1;
                }
            }

            int answer = 0;
            for(int i = 1; i <= H; i++) {
                for(int j = 1; j <= W; j++) {
                    if(!visited[i][j] && map[i][j]) {
                        answer++;
                        dfs(i, j);
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
