class Solution {
    public int solution(int a, int b) {
        int concatValue = Integer.parseInt(a + "" + b); // a ⊕ b 연산
        int productValue = 2 * a * b; // 2 * a * b 연산

        return Math.max(concatValue, productValue);
    }
}
