import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        return factorial(balls).divide(factorial(share).multiply(factorial(balls - share))).intValue();
    }

    private BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
