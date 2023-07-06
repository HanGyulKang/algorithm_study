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

        int x = getMinimumValue(x_map);
        int y = getMinimumValue(y_map);

        int[] answer = {x, y};
        return answer;
    }

    public static void main(String[] args) {
        직사각형나머지하나꼭지점좌표찾기 main = new 직사각형나머지하나꼭지점좌표찾기();
        int[][] v = {{1, 4}, {3, 4}, {3, 10}};

        int[] solution = main.solution(v);

        System.out.println(solution[0] + ", " + solution[1]);
    }
}
