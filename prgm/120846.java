// 합성수 찾기
// 문제 설명
// 약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
class Solution {
    public int solution(int n) {
        int res = 0;
        for(int i = 4; i <= n; i++){
            int t = 0;
            for(int j = 1; j <= i; j++){
                if(i%j == 0){
                    t += 1;
                }
                if(t >= 3){
                    res += 1;
                    break;
                }
            }
        }
        return res;
    }
}