class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // queries에 있는 각 구간에 대해 처리
        for (int[] query : queries) {
            int s = query[0];  // 구간 시작 인덱스
            int e = query[1];  // 구간 끝 인덱스
            
            // s부터 e까지 배열의 각 원소에 1을 더함
            for (int i = s; i <= e; i++) {
                arr[i] += 1;
            }
        }
        
        // 처리 후 배열을 반환
        return arr;
    }
}
