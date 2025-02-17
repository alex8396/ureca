class Solution {
    public int solution(int[] dot) {
        if (dot[0] > 0 && dot[1] > 0) {
            return 1; // 제 1사분면
        } else if (dot[0] < 0 && dot[1] > 0) {
            return 2; // 제 2사분면
        } else if (dot[0] < 0 && dot[1] < 0) {
            return 3; // 제 3사분면
        } else {
            return 4; // 제 4사분면
        }
    }
}
