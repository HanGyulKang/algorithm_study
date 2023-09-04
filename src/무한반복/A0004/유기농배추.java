package 무한반복.A0004;

import java.io.*;
import java.util.StringTokenizer;

public class 유기농배추 {

    final static int[] DIRECTION_ROW = {0, 0, 1, -1};
    final static int[] DIRECTION_COL = {1, -1, 0, 0};
    final static int CHECK_DIRECTION_SIZE = 4;
    final static int BUFFER = 2;
    final static int POSITION_CORRECTION = 1;
    final static int INITIAL_POSITION = 1;
    final static boolean PEST_ERADICATION_COMPLETE = Boolean.FALSE;
    final static boolean PEST_PROBLEM = Boolean.TRUE;

    static int T, COL, ROW, K;
    static boolean[][] organicCabbageFarmAtHighland;
    static int answer;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            COL = Integer.parseInt(st.nextToken());
            ROW = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            int colSize = COL + BUFFER;
            int rowSize = ROW + BUFFER;
            organicCabbageFarmAtHighland = new boolean[rowSize][colSize];

            int col, row;
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                col = Integer.parseInt(st.nextToken()) + POSITION_CORRECTION;
                row = Integer.parseInt(st.nextToken()) + POSITION_CORRECTION;

                organicCabbageFarmAtHighland[row][col] = PEST_PROBLEM;
            }

            answer = 0;
            for (int i = INITIAL_POSITION; i <= ROW; i++) {
                for (int j = INITIAL_POSITION; j <= COL; j++) {
                    if (hasPestHere(organicCabbageFarmAtHighland[i][j])) {
                        answer++;
                        organicCabbageWorm(i, j);
                    }
                }
            }

            bw.write(String.valueOf(answer));
            bw.newLine();
        }

        br.close();
        bw.close();
    }

    private static void organicCabbageWorm(int row, int col) {
        organicCabbageFarmAtHighland[row][col] = PEST_ERADICATION_COMPLETE;

        for (int i = 0; i < CHECK_DIRECTION_SIZE; i++) {
            int newRow = row + DIRECTION_ROW[i];
            int newCol = col + DIRECTION_COL[i];

            if(organicCabbageFarmAtHighland[newRow][newCol]) {
                organicCabbageWorm(newRow, newCol);
            }
        }
    }

    private static boolean hasPestHere(boolean hasPest) {
        return hasPest;
    }
}
