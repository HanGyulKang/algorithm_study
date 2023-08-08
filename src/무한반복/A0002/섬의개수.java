package 무한반복.A0002;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 섬의개수 {

    static int COL, ROW;
    static boolean[][] map;
    static boolean[][] visited;
    static int[] dirX = {0,0,1,-1,1,1,-1,-1};
    static int[] dirY = {-1,1,0,0,1,-1,1,-1};


    public static void dfs(int row, int col) {
        visited[row][col] = true;

        for (int i = 0; i < dirX.length; i++) {
            int newX = row + dirX[i];
            int newY = col + dirY[i];

            if(!visited[newX][newY] && map[newX][newY]) {
                dfs(newX, newY);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> answer = new ArrayList<>();
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            COL = Integer.parseInt(st.nextToken());
            ROW = Integer.parseInt(st.nextToken());

            if((COL + ROW) == 0) {
                break;
            }

            int col = COL + 5;
            int row = ROW + 5;
            map = new boolean[row][col];
            visited = new boolean[row][col];

            for (int i = 1; i <= ROW; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= COL; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken()) == 1;
                }
            }

            int count = 0;
            for (int i = 1; i <= ROW; i++) {
                for (int j = 1; j <= COL; j++) {
                    if(!visited[i][j] && map[i][j]) {
                        count++;
                        dfs(i, j);
                    }
                }
            }

            answer.add(count);
        }

        for (int i = 0; i < answer.size(); i++) {
            bw.write(String.valueOf(answer.get(i)));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
