class Solution {
    public int solution(int[] box, int n) {
        // 각 차원에 들어갈 수 있는 주사위 개수를 계산 후 곱합니다.
        return (box[0] / n) * (box[1] / n) * (box[2] / n);
    }
}
