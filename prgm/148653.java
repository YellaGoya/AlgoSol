import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Solution {
    static Queue<int[]> q = new LinkedList<>();
    static Map<Integer, Integer> m = new HashMap<>();
    static int min = Integer.MAX_VALUE;
    
    public void dfs(int numb, int pos, int cnt) {
        if (numb == 0) {
            if (min > cnt)
                min = cnt;
            return;
        }

        int posNum = numb % (pos * 10) / pos;

        if (numb % (pos * 10) != numb || numb / pos > 5) {
            dfs(numb + (10 - posNum) * pos, pos * 10, cnt + 10 - posNum);
        }
        dfs(numb - posNum * pos, pos * 10, cnt + posNum);
    }
    
    public int solution(int storey) {
        dfs(storey, 1, 0);
        return min;

    }
}