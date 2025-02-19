class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // queries 배열의 각 원소에 대해 처리
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];
            
            // arr[i]와 arr[j]의 값을 서로 바꿈
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        // 최종 배열 반환
        return arr;
    }
}
