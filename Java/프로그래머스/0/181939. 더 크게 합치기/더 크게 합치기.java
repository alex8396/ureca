class Solution {
    public int solution(int a, int b) {
        // 두 숫자를 문자열로 변환 후 이어붙이고 정수로 변환
        int ab = Integer.parseInt(a + "" + b);
        int ba = Integer.parseInt(b + "" + a);
        
        // 더 큰 값 반환 (같으면 ab 반환)
        return Math.max(ab, ba);
    }
}
