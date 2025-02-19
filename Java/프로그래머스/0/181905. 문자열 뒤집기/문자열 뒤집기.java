class Solution {
    public String solution(String my_string, int s, int e) {
        // s부터 e까지 부분 문자열을 추출하고 뒤집기
        String before = my_string.substring(0, s);  // s 이전 부분
        String middle = my_string.substring(s, e + 1);  // s부터 e까지 부분
        String after = my_string.substring(e + 1);  // e 이후 부분
        
        // middle을 뒤집고 결과를 반환
        String reversedMiddle = new StringBuilder(middle).reverse().toString();
        
        // 최종 결과는 before + reversedMiddle + after
        return before + reversedMiddle + after;
    }
}
