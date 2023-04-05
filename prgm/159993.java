import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int row, col;
    static int[][] goals = new int[2][2];
    static Queue<int[]> Q = new LinkedList<>();
    static int[][] dir = { { 0, 0, 1, -1 }, { 1, -1, 0, 0 } };
    static boolean[][] wall;
    
    public int solution(String[] maps) {
        row = maps.length;
        col = maps[0].length();
        wall = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                switch (maps[i].charAt(j)) {
                    case 'L':
                        goals[0][0] = i;
                        goals[0][1] = j;
                        break;
                    case 'E':
                        goals[1][0] = i;
                        goals[1][1] = j;
                        break;
                    case 'S':
                        Q.add(new int[] { i, j });
                        break;
                    case 'X':
                        wall[i][j] = true;
                }
            }
        }
        boolean[][] flag = new boolean[row][col];
        int time = run(flag, 0);
        if (time == -1)
            return -1;

        Q.add(new int[] { goals[0][0], goals[0][1] });
        flag = new boolean[row][col];
        int time2 = run(flag, 1);
        if (time2 == -1)
            return -1;

        return time + time2;
    }

    public int run(boolean[][] flag, int g) {
        int[][] time = new int[row][col];
        boolean nfound = false;

        while (!Q.isEmpty()) {
            int[] pos = Q.poll();
            for (int i = 0; i < 4; i++) {
                int x = pos[0] + dir[0][i];
                int y = pos[1] + dir[1][i];
                if (x < 0 || x == row || y < 0 || y == col || wall[x][y] || flag[x][y])
                    continue;
                if (x == goals[g][0] && y == goals[g][1])
                    nfound = true;
                
                time[x][y] = time[pos[0]][pos[1]] + 1;
                flag[x][y] = true;

                Q.add(new int[] { x, y });
            }
        }

        Q.clear();
        return nfound ? time[goals[g][0]][goals[g][1]] : -1;
    }
}