class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1부터 n까지 반복하여 a가 n의 약수인지 확인
        for (int a = 1; a <= n; a++) {
            if (n % a == 0) {  // a가 n의 약수라면
                int b = n / a;
                answer++; // (a, b) 순서쌍을 하나 찾음
            }
        }
        
        return answer;
    }
}
