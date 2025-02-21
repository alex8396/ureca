class Solution {
    public int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];

        // 1. 가장 긴 변이 기존 변 중 하나일 때 (새로운 변 x 가 가장 짧거나 중간인 경우)
        int count1 = Math.min(a, b); // x의 범위: 1 ≤ x < (a + b)

        // 2. 새로운 변이 가장 긴 변일 때 (x > 기존 두 변 중 가장 큰 값)
        int count2 = (a + b - 1) - Math.max(a, b); // x의 범위: (max(a, b) < x < a + b)

        return count1 + count2;
    }
}
