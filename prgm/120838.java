// 모스부호 (1)
// 문제 설명
// 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
class Solution {
    public String solution(String letter) {
        String[] mosCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.." };
        
        String[] alps = letter.split(" ");
        String answer = "";
        for(String a : alps){
            for(int i = 0 ; i< mosCode.length; i++){
                if(a.equals(mosCode[i]))
                    answer += (char)(97+i);
            }
        }
        return answer;
    }
}