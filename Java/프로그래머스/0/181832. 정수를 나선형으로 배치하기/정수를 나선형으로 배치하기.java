class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1; // 시작 숫자
        int top = 0, left = 0, bottom = n - 1, right = n - 1; // 상, 좌, 하, 우 경계 설정

        while (num <= n * n) {
            // 왼쪽에서 오른쪽으로 채우기
            for (int i = left; i <= right; i++) {
                answer[top][i] = num++;
            }
            top++; // 위쪽 경계 이동

            // 위에서 아래로 채우기
            for (int i = top; i <= bottom; i++) {
                answer[i][right] = num++;
            }
            right--; // 오른쪽 경계 이동

            // 오른쪽에서 왼쪽으로 채우기
            for (int i = right; i >= left; i--) {
                answer[bottom][i] = num++;
            }
            bottom--; // 아래쪽 경계 이동

            // 아래에서 위로 채우기
            for (int i = bottom; i >= top; i--) {
                answer[i][left] = num++;
            }
            left++; // 왼쪽 경계 이동
        }

        return answer;
    }
}
