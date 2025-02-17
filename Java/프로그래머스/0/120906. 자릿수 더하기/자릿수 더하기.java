class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // n을 문자열로 바꾼 후, 각 자릿수를 하나씩 더함
        String nStr = Integer.toString(n);  // 정수를 문자열로 변환
        
        // 각 자릿수를 하나씩 더함
        for (char c : nStr.toCharArray()) {
            answer += c - '0';  // 문자 '0'의 아스키 코드 값을 빼서 숫자로 변환
        }
        
        return answer;
    }
}
