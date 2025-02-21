class Solution {
    // 기울기를 계산하는 함수
    public double getSlope(int[] p1, int[] p2) {
        return (double)(p2[1] - p1[1]) / (p2[0] - p1[0]);
    }
    
    public int solution(int[][] dots) {
        // 주어진 네 점에서 두 점씩 연결하여 기울기를 비교
        // 기울기가 같은 직선들이 평행
        if (getSlope(dots[0], dots[1]) == getSlope(dots[2], dots[3]) || 
            getSlope(dots[0], dots[2]) == getSlope(dots[1], dots[3]) || 
            getSlope(dots[0], dots[3]) == getSlope(dots[1], dots[2])) {
            return 1; // 평행한 직선이 존재
        }
        
        return 0; // 평행한 직선이 존재하지 않음
    }
}
