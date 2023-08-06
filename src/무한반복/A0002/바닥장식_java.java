package 무한반복.A0002;

import java.io.*;
import java.util.StringTokenizer;

public class 바닥장식_java {
    static int ROW, COL;
    static char[][] map;
    static int answer;

    public static void dfs(int row, int col) {
        char currentFloor = map[row][col];
        map[row][col] = 'x';

        if(currentFloor == '-' && map[row][col + 1] == '-') {
            dfs(row, col + 1);
        }

        if(currentFloor == '|' && map[row + 1][col] == '|') {
            dfs(row + 1, col);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        ROW = Integer.parseInt(st.nextToken());
        COL = Integer.parseInt(st.nextToken());

        if(ROW == 1 && COL == 1) {
            answer = 1;
        } else {
            map = new char[ROW + 2][COL + 2];

            for(int i = 1; i <= ROW; i++) {
                String floor = br.readLine();
                for (int j = 1; j <= COL; j++) {
                    map[i][j] = floor.charAt(j - 1);
                }
            }

            for(int i = 1; i <= ROW; i++) {
                for (int j = 1; j <= COL; j++) {
                    if(map[i][j] != 'x') {
                        answer++;
                        dfs(i, j);
                    }
                }
            }
        }

        bw.write(String.valueOf(answer));
        br.close();
        bw.close();
    }
}
