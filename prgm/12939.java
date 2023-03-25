class Solution {
    public String solution(String s) {
        int min = 0, max = 0;
        boolean init = true;
        String[] splited = s.split(" ");
        for (String n : splited) {
            int numb = Integer.parseInt(n);
            if (init) {
                min = max = numb;
                init = false;
            } else {
                if (min > numb)
                    min = numb;
                if (max < numb)
                    max = numb;
            }
        }
        return min + " " + max;
    }
}