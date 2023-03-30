import java.util.Arrays;

class Solution {
    public long solution(int[] weights) {
        long n = 0;
        Arrays.sort(weights);
        for (int i = 0; i < weights.length - 1; i++) {
            long step = 0;
            for (int j = i + 1; j < weights.length; j++) {
                double temp = Math.floor(((double) weights[j] / (double) weights[i]) * 100000) / 100000.0;
                if (temp == 1 || temp == 1.5 || temp == 2 || temp == 1.33333) {
                    step++;
                }
            }
            n += step;

            long skip = 1;
            while (i < weights.length - 1 && weights[i] == weights[i + 1]) {
                i++;
                n += step - skip++;
            }
        }
        return n;
    }
}