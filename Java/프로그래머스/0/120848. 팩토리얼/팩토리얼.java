class Solution {
    public int solution(int n) {
        int i = 1;
        int fact = 1;
        
        while (fact <= n) {
            i++;
            fact *= i;
        }
        
        return i - 1; // fact가 n을 초과한 상태에서 반복문을 종료하므로, i - 1이 정답
    }
}
