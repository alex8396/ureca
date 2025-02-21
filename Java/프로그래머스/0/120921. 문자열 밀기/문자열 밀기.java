class Solution {
    public int solution(String A, String B) {
        // A와 B의 길이가 다르면 밀어서 변환할 수 없다.
        if (A.length() != B.length()) {
            return -1;
        }

        // 문자열 A를 밀면서 B와 일치하는지 확인
        String rotated = A;
        for (int i = 0; i < A.length(); i++) {
            if (rotated.equals(B)) {
                return i; // 밀어야 할 최소 횟수
            }
            // 오른쪽으로 한 칸 밀기
            rotated = rotated.charAt(A.length() - 1) + rotated.substring(0, A.length() - 1);
        }

        // 만약 밀어도 B가 되지 않으면 -1을 반환
        return -1;
    }
}
