class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        // 두 문자열의 길이는 동일하므로 한 문자열의 길이를 기준으로 진행
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i); // str1의 i번째 문자
            answer += str2.charAt(i); // str2의 i번째 문자
        }
        
        return answer; // 결과 반환
    }
}
