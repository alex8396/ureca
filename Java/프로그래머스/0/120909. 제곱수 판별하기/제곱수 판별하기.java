class Solution {
    public int solution(int n) {
        // 제곱근을 구하고, 그 값이 정수인지 확인
        double sqrt = Math.sqrt(n);
        
        // 제곱근이 정수라면 제곱수이므로 1을 반환, 아니면 2를 반환
        if (sqrt == (int) sqrt) {
            return 1;
        } else {
            return 2;
        }
    }
}
