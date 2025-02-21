class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 분수 덧셈 계산: (numer1 * denom2 + numer2 * denom1) / (denom1 * denom2)
        int numerator = numer1 * denom2 + numer2 * denom1;
        int denominator = denom1 * denom2;
        
        // 최대공약수 계산
        int gcd = gcd(numerator, denominator);
        
        // 기약분수로 만들기
        numerator /= gcd;
        denominator /= gcd;
        
        // 결과 반환
        return new int[] {numerator, denominator};
    }
    
    // 최대공약수 계산 함수
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
