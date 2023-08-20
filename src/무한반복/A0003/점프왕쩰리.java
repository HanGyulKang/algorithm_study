package 무한반복.A0003;

import java.io.*;
import java.util.StringTokenizer;

public class 점프왕쩰리 {

    final static int SIZE = 110;
    final static int GOAL = -1;
    static String answer = "Hing";
    static int[][] map = new int[SIZE][SIZE];


    public static void dfs(int row, int col) {
        int point = map[row][col];

        if(point == GOAL) {
            answer = "HaruHaru";
            return;
        } else if(point == 0) {
            return;
        }

        dfs(row + point, col);
        dfs(row, col + point);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(1, 1);

        bw.write(answer);
        br.close();
        bw.close();
    }
}
