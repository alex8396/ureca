public class Solution {
    public static int solution(int n) {
        // 최소공배수를 구하고, 6으로 나누어 최소 판 수를 구함
        return (n * 6) / gcd(n, 6) / 6;
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(solution(6));  // 1
        System.out.println(solution(10)); // 5
        System.out.println(solution(4));  // 2
    }
}
