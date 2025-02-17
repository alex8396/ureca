class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        // 주어진 code 배수마다 문자를 추출
        for (int i = code - 1; i < cipher.length(); i += code) {
            answer += cipher.charAt(i);  // 해당 인덱스의 문자 추가
        }
        
        return answer;
    }
}
