class Solution {
    public String solution(String myString) {
        StringBuilder result = new StringBuilder();
        
        // 문자열을 하나씩 확인
        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            
            // 'l'보다 작은 문자는 'l'로 바꿔줌
            if (ch < 'l') {
                result.append('l');
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}
