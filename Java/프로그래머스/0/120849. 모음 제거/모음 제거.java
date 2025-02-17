class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        // 모음 리스트
        String vowels = "aeiou";
        
        // 문자열의 각 문자 확인
        for (char c : my_string.toCharArray()) {
            // 모음이 아니면 결과에 추가
            if (vowels.indexOf(c) == -1) {
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}
