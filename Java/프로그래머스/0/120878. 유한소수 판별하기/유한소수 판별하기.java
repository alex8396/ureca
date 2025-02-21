import java.util.*;

class Solution {
    public int solution(int a, int b) {
        // 최대공약수 (GCD) 구하기
        int gcd = gcd(a, b);
        
        // 기약분수로 바꾸기 위해 a와 b를 최대공약수로 나눈다
        b /= gcd;
        
        // b가 2와 5로만 나누어지는지 확인
        while (b % 2 == 0) {
            b /= 2;
        }
        
        while (b % 5 == 0) {
            b /= 5;
        }
        
        // b가 1이면 유한소수, 그렇지 않으면 무한소수
        return (b == 1) ? 1 : 2;
    }
    
    // 최대공약수 구하기 (유클리드 알고리즘)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
