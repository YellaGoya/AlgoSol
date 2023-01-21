// A로 B 만들기
// 문제 설명
// 문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
import java.util.HashMap;
import java.util.Map;


class Solution {
    public int solution(String before, String after) {
        Map<Character, Integer> C = new HashMap<>();
        for (int i = 0; i < before.length(); i++) {
            C.put(before.charAt(i), C.getOrDefault(before.charAt(i), 0) + 1);
        }

        for (int i = 0; i < after.length(); i++) {
            C.put(after.charAt(i), C.getOrDefault(after.charAt(i), 0) - 1);
        }

        int res = 1;

        for (char c : C.keySet()) {
            if (C.get(c) != 0) {
                res = 0;
            }
        }

        return res;
    }
}