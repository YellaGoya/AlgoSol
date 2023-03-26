class Solution {
    public String solution(int n, int t, int m, int p) {
        int target = m * (t - 1) + p;

        int pos = 0;
        int max = n;
        int amount = n;
        for (int i = 2; max < target; i++) {
            pos = amount + (target - max + i - 1) / i;
            amount += (int) (Math.pow(n, i) - Math.pow(n, i - 1));
            max += (int) (Math.pow(n, i) - Math.pow(n, i - 1)) * i;
        }
        String s = "";
        String res = "";
        for (int i = 0; i < pos; i++) {
            s += Integer.toString(i, n);
        }

        for (int i = p - 1; i <= target; i += m) {
            res += s.charAt(i);
        }

        return res.toUpperCase();
    }
}