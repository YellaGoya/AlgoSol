// 다음에 올 숫자
// 문제 설명
// 등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
class Solution {
    public int solution(int[] common) {
        int jmp = 1;
        if(common[1] - common[0] != 0){jmp = (common[2] - common[1]) / (common[1] - common[0]);}
        int len = common.length;
        
        if(jmp == 1){
            return (common[len - 1] - common[len - 2]) + common[len - 1];
        } else{
            return (common[len - 1] - common[len - 2]) * jmp + common[len - 1];
        }
    }
}