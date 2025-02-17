import java.util.HashSet;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder(); // 결과 문자열을 저장할 StringBuilder
        HashSet<Character> seen = new HashSet<>(); // 이미 등장한 문자들을 저장할 Set
        
        for (char ch : my_string.toCharArray()) {
            if (!seen.contains(ch)) { // 해당 문자가 아직 등장하지 않았으면
                seen.add(ch); // 등장한 문자로 추가
                answer.append(ch); // 결과 문자열에 추가
            }
        }
        
        return answer.toString(); // StringBuilder에서 결과 반환
    }
}
