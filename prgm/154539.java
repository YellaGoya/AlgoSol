import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        int[] res = new int[numbers.length];
        Stack<Integer> max = new Stack<>();
        
        for (int i = numbers.length - 1; i >= 0; i--) {
            int pos = -1;
            while (!max.isEmpty()) {
                if (numbers[i] < max.peek()) {
                    pos = max.peek();
                    break;
                }
                max.pop();
            }
            res[i] = pos;
            max.add(numbers[i]);
        }

        return res;
    }
}