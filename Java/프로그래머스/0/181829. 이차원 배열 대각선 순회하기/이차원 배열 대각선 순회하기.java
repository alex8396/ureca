class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        
        // 2차원 배열을 순회하면서 i + j <= k 조건을 만족하는 값을 더함
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) {
                    answer += board[i][j];
                }
            }
        }
        
        return answer;
    }
}
