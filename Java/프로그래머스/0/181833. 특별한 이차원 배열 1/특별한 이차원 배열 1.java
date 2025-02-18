class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];  // n x n 크기의 2D 배열 생성
        
        // 대각선에 1을 채워넣기
        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;  // i == j인 곳에 1을 설정
        }
        
        return answer;  // 결과 반환
    }
}
