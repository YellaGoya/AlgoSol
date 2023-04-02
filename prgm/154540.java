import java.util.*;

class Solution {
    public int[] solution(String[] maps) {
        int xl = maps.length;
        int yl = maps[0].length();
        int sum;

        boolean[][] visit = new boolean[xl][yl];
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < xl; i++) {
            for (int j = 0; j < yl; j++) {
                sum = finder(i, j, visit, maps);

                if (sum > 0) {
                    res.add(sum);
                }
            }
        }

        Collections.sort(res);
        return res.isEmpty() ? new int[] { -1 }
                : res.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int finder(int i, int j, boolean[][] visit, String[] maps) {
        if (i < 0 || j < 0 || i >= visit.length
                || j >= visit[0].length || visit[i][j] || maps[i].charAt(j) == 'X')
            return 0;

        visit[i][j] = true;
        return (maps[i].charAt(j) - '0')
                + finder(i - 1, j, visit, maps)
                + finder(i + 1, j, visit, maps)
                + finder(i, j - 1, visit, maps)
                + finder(i, j + 1, visit, maps);
    }
}