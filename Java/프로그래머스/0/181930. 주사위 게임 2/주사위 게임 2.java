class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if (a == b && b == c) {
            // 세 숫자가 모두 같을 때
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else if (a == b || b == c || a == c) {
            // 두 숫자가 같을 때
            answer = (a + b + c) * (a * a + b * b + c * c);
        } else {
            // 세 숫자가 모두 다를 때
            answer = a + b + c;
        }
        
        return answer;
    }
}
