class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        // my_string의 길이를 m으로 나누어 각 줄의 c번째 문자를 구함
        for (int i = c - 1; i < my_string.length(); i += m) {
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}
