class Solution {
    public int solution(int[][] board) {
        int n = board.length; // board의 크기
        boolean[][] danger = new boolean[n][n]; // 위험 지역을 표시할 배열
        
        // 지뢰가 있는 곳과 그 인접 지역을 위험지역으로 표시
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) { // 지뢰가 있는 곳
                    // 상하좌우대각선 8방향 체크
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            int ni = i + di;
                            int nj = j + dj;
                            // 범위 안에 있을 경우
                            if (ni >= 0 && ni < n && nj >= 0 && nj < n) {
                                danger[ni][nj] = true;
                            }
                        }
                    }
                }
            }
        }
        
        // 안전 지역의 수 계산
        int safeCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!danger[i][j]) { // 위험 지역이 아닌 곳
                    safeCount++;
                }
            }
        }
        
        return safeCount; // 안전지역 수 반환
    }
}
