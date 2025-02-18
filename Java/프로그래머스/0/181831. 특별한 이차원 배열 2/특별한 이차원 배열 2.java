class Solution {
    public int solution(int[][] arr) {
        int n = arr.length; // 배열의 크기 (n x n)
        
        // 이중 루프를 사용하여 대칭성 검사
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return 0; // 대칭이 아니면 0 반환
                }
            }
        }
        
        return 1; // 모든 조건을 만족하면 1 반환
    }
}
