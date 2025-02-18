class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        // 두 주사위 값이 모두 홀수인 경우
        if (a % 2 != 0 && b % 2 != 0) {
            answer = a * a + b * b;
        }
        // 두 주사위 중 하나만 홀수인 경우
        else if (a % 2 != 0 || b % 2 != 0) {
            answer = 2 * (a + b);
        }
        // 두 주사위 모두 홀수가 아닌 경우
        else {
            answer = Math.abs(a - b);
        }
        
        return answer;
    }
}
