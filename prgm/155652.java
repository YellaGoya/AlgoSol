class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        char[] cl = skip.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - 97;
            for (int j = 1; j <= index; j++) {
                boolean flag = false;
                temp = ++temp % 26;
                for (char c : cl) {
                    if (temp == c - 97) {
                        flag = true;
                    }
                }
                if (flag)
                    j--;
            }
            sb.append((char) (temp + 97));
        }
        return sb.toString();
    }
}