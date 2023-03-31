import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static Queue<Integer> q = new LinkedList<>();
    static int[] arr;

    public int solution(int x, int y, int n) throws Exception {
        arr = new int[y + 1];
        arr[x] = 0;

        q.add(x);
        while (!q.isEmpty()) {
            x = q.poll();
            if (x == y)
                return arr[x];

            if (0 <= x + n && x + n <= y && arr[x + n] == 0) {
                arr[x + n] = arr[x] + 1;
                q.add(x + n);
            }
            if (0 <= x * 2 && x * 2 <= y && arr[x * 2] == 0) {
                arr[x * 2] = arr[x] + 1;
                q.add(x * 2);
            }
            if (0 <= x * 3 && x * 3 <= y && arr[x * 3] == 0) {
                arr[x * 3] = arr[x] + 1;
                q.add(x * 3);
            }
        }

        return -1;
    }
}
