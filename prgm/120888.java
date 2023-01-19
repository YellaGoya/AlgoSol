// 중복된 문자 제거
// 문제 설명
// 문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
class Solution {
    public String solution(String my_string) {
        int len = my_string.length();
        boolean flag;
        String ex = "";
        String sen = "";
        for(int i = 0; i < len; i++){
            flag = false;
            for(int j = 0; j < ex.length(); j++){
                if(ex.charAt(j)==my_string.charAt(i)){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                ex += my_string.charAt(i);
                sen += my_string.charAt(i);
            }
        }
        return sen;
    }
}