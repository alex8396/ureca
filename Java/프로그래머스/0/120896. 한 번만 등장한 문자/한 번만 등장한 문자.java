import java.util.*;

class Solution {
    public String solution(String s) {
        // 문자의 등장 횟수를 세기 위한 맵
        Map<Character, Integer> charCount = new HashMap<>();
        
        // 문자열을 순회하며 각 문자 등장 횟수 세기
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // 한 번만 등장하는 문자들만 리스트에 저장
        List<Character> resultList = new ArrayList<>();
        for (char c : charCount.keySet()) {
            if (charCount.get(c) == 1) {
                resultList.add(c);
            }
        }
        
        // 한 번만 등장한 문자들을 사전 순으로 정렬
        Collections.sort(resultList);
        
        // 정렬된 문자들을 문자열로 변환하여 반환
        StringBuilder answer = new StringBuilder();
        for (char c : resultList) {
            answer.append(c);
        }
        
        return answer.toString();
    }
}
