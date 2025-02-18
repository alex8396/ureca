class Solution {
    public int solution(String number) {
        int sum = 0;
        
        // 각 자리 숫자를 더함
        for (char c : number.toCharArray()) {
            sum += c - '0';  // 문자 '0'의 아스키 값을 빼서 숫자 값을 구함
        }
        
        // 합을 9로 나눈 나머지 반환
        return sum % 9;
    }
}
