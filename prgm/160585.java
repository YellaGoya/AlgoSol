class Solution {
    static int num, total, xWin, oWin, x, o = 0;
    static int[] line = new int[8];
    
    public int solution(String[] board) {
        for (int i = 0; i < 9; i++) {
            switch (board[i / 3].charAt(i % 3)) {
                case 'O':
                    num = 10;
                    break;
                case 'X':
                    num = 1;
                    break;
                case '.':
                    num = 0;
                    break;
            }
            
            line[i / 3] += num;
            line[3 + i % 3] += num;
            if (i / 3 == i % 3)
                line[6] += num;
            if (i / 3 + i % 3 == 2)
                line[7] += num;

            total += num;
        }
        
        o = total / 10;
        x = total % 10;
        if (o < x || o > x + 1)
            return 0;
        
        for (int i : line) {
            if (i == 30)
                oWin++;
            else if (i == 3)
                xWin++;
        }

        if ((o == x && oWin > 0) || (o > x && xWin > 0) || oWin > 2 || xWin > 1)
            return 0;
        
        return 1;
    }
}