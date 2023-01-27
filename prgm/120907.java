// OX퀴즈
// 문제 설명
// 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다. 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
class Solution {
    public String[] solution(String[] quiz) {
        String[] ox = new String[quiz.length]; 
        int ind = 0;
        for(String q : quiz){
            String[] math = q.split(" ");
            int a = Integer.parseInt(math[0]);
            int b = Integer.parseInt(math[2]);
            int c = Integer.parseInt(math[4]);
            int ans = math[1].equals("+") ? a + b : a - b;
            
            ox[ind++] = c == ans ? "O" : "X";
        }
        return ox;
    }
}