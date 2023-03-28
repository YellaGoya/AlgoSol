import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[col - 1] != o2[col - 1] ? o1[col - 1] - o2[col - 1]
                        : o2[0] - o1[0];
            }
        });
        int xored = 0;
        for (int i = row_begin; i <= row_end; i++) {
            int sum = 0;
            for (int target : data[i - 1]) {
                sum += target % i;
            }
            xored ^= sum;
        }

        return xored;
    }
}