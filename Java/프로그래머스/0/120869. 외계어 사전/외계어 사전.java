import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        // spell을 Set으로 변환 (중복 제거 및 정렬 무관)
        Set<Character> spellSet = new HashSet<>();
        for (String s : spell) {
            spellSet.add(s.charAt(0));
        }

        // dic의 단어들과 비교
        for (String word : dic) {
            Set<Character> wordSet = new HashSet<>();
            for (char c : word.toCharArray()) {
                wordSet.add(c);
            }

            // spell의 문자와 word의 문자들이 정확히 일치하면 1 반환
            if (spellSet.equals(wordSet)) {
                return 1;
            }
        }

        return 2; // 일치하는 단어가 없으면 2 반환
    }
}
