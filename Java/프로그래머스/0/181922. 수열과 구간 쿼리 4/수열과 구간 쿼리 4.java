class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 각 쿼리를 순차적으로 처리
        for (int[] query : queries) {
            int s = query[0];  // 시작 인덱스
            int e = query[1];  // 끝 인덱스
            int k = query[2];  // 배수
            
            // s부터 e까지의 범위에서 k의 배수인 인덱스를 찾아 arr[i]에 1을 더함
            for (int i = s; i <= e; i++) {
                if (i % k == 0) {
                    arr[i] += 1;
                }
            }
        }
        
        // 처리 후 최종 배열 반환
        return arr;
    }
}
