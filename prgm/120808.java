// 분수의 덧셈
// 문제 설명
// 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        
        int n = numer;
        int d = denom;
        int t;
        if(n < d){
            t = n;
            n = d;
            d = t;
        }
        
        while(d!=0){
            t = n % d;
            n = d;
            d = t;
        }
        
        return new int[] {numer/n, denom/n};
    }
}