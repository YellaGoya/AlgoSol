// 최빈값 구하기
// 문제 설명
// 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
class Solution {
    static int[] freq = new int[1000];
    static int max = 0;
    static int ind;
    static boolean flag;
    public int solution(int[] array) {
        int len = array.length;
        ind = array[0];
        
        for(int i = 0; i < len; i++) {
            freq[array[i]]++;
            
            if(max < freq[array[i]]) {
                max = freq[array[i]];
                ind = array[i];
                flag = false;
            } else if(max==freq[array[i]])
                flag = true;
        }
        
        return flag? -1 : ind;
    }
}