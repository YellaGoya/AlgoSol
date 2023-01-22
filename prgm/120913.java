// 잘라서 배열로 저장하기
// 문제 설명
// 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length() + n - 1) / n];
        for(int i = 0; i < answer.length - 1; i ++){
            answer[i] = my_str.substring(i*n, (i+1)*n);
        }
        answer[answer.length - 1] = my_str.substring((answer.length - 1) * n);
        return answer;
    }
}