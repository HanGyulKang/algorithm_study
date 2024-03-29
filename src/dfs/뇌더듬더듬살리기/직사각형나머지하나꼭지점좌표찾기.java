package dfs.뇌더듬더듬살리기;

import java.util.HashMap;
import java.util.Map;

public class 직사각형나머지하나꼭지점좌표찾기 {

    public Map getEdgeCount(int count, int[][] v) {
        Map result = new HashMap();

        // x, y 각 좌표 카운트 세기
        for (int i = 0; i < 3; i++) {
            result.put(v[i][count], (int)result.getOrDefault(v[i][count], 0) + 1);
        }

        return result;
    }

    public int getMinimumValue(Map map) {
        int min = 0;

        // 카운트 모자란 애 하나 찾기(무조건 1이 하나 부족한 좌표임)
        for(int i = 0; i < map.size(); i++) {
            if(map.values().toArray()[i].equals(1)) {
                min = (int) map.keySet().toArray()[i];
            }
        }

        return min;
    }

    public int[] solution(int[][] v) {
        Map x_map = getEdgeCount(0, v);
        Map y_map = getEdgeCount(1, v);

        System.out.println(x_map);
        System.out.println(y_map);

        int x = getMinimumValue(x_map);
        int y = getMinimumValue(y_map);

        int[] answer = {x, y};
        return answer;
    }

    public int[] solution2(int[][] v) {
        int[] answer = new int[2];

        // 교환식이래... 두 줄 로 끝남
        answer[0] = v[0][0]^v[1][0]^v[2][0];
        answer[1] = v[0][1]^v[1][1]^v[2][1];

        return answer;
    }

    public static void main(String[] args) {
        직사각형나머지하나꼭지점좌표찾기 main = new 직사각형나머지하나꼭지점좌표찾기();
        int[][] v = {{1, 4}, {3, 4}, {3, 10}};

        int[] solution = main.solution(v);
        int[] solution2 = main.solution2(v);

        System.out.println(solution[0] + ", " + solution[1]);
        System.out.println(solution2[0] + ", " + solution2[1]);
    }
}
