class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();
        
        // 문자열 code의 각 인덱스를 순차적으로 확인
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                answer.append(code.charAt(i));  // 조건에 맞는 문자를 이어붙임
            }
        }
        
        // 최종 결과 반환
        return answer.toString();
    }
}
