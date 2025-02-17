class Solution {
    public int solution(int order) {
        int answer = 0;
        
        // 숫자를 문자열로 변환하여 각 자릿수 확인
        String str = Integer.toString(order);
        
        // 각 자릿수에 대해 확인
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // 3, 6, 9이면 박수를 칩니다.
            if (ch == '3' || ch == '6' || ch == '9') {
                answer++;
            }
        }
        
        return answer;
    }
}
