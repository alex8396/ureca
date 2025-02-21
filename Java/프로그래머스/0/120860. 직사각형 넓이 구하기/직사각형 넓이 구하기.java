class Solution {
    public int solution(int[][] dots) {
        int minX = dots[0][0], maxX = dots[0][0];
        int minY = dots[0][1], maxY = dots[0][1];
        
        // 최소, 최대 좌표 찾기
        for (int[] dot : dots) {
            minX = Math.min(minX, dot[0]);
            maxX = Math.max(maxX, dot[0]);
            minY = Math.min(minY, dot[1]);
            maxY = Math.max(maxY, dot[1]);
        }
        
        // 가로, 세로 길이 계산
        int width = maxX - minX;
        int height = maxY - minY;
        
        return width * height;
    }
}
