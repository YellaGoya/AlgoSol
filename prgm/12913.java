class Solution {
    static int[][] sum;
    static int max;
    static length len;
    
    int solution(int[][] land) {
        len = new length(land.length, land[0].length);
        sum = new int[len.h][len.w];
        sum[0] = land[0].clone();

        scape(1, land);

        max = 0;
        for (int i = 0; i < len.w; i++) {
            if (max < sum[len.h - 1][i])
                max = sum[len.h - 1][i];
        }

        return max;
    }
    
    void scape(int n, int[][] land) {
        if (n == len.h)
            return;

        for (int i = 0; i < len.w; i++) {
            max = 0;
            for (int j = 0; j < len.w; j++) {
                if (i == j)
                    continue;
                if (max < sum[n - 1][j])
                    max = sum[n - 1][j];
            }
            sum[n][i] = max + land[n][i];
        }

        scape(n + 1, land);
    }
}

class length {
    int h;
    int w;

    public length() {
    }

    public length(int h, int w) {
        this.h = h;
        this.w = w;
    }
}