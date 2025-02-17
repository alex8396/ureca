class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1부터 n까지 모든 숫자에 대해 약수의 개수를 셈
        for (int i = 4; i <= n; i++) { // 1은 합성수가 아니므로 4부터 시작
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            
            // 약수의 개수가 3개 이상이면 합성수
            if (count >= 3) {
                answer++;
            }
        }
        
        return answer;
    }
}
