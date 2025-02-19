class Solution {
    public int[] solution(int[] arr) {
        int firstIndex = -1;
        int lastIndex = -1;
        
        // 배열을 순차적으로 탐색하여 첫 번째와 마지막 2의 인덱스를 찾기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (firstIndex == -1) {
                    firstIndex = i; // 첫 번째 2의 인덱스를 기록
                }
                lastIndex = i; // 마지막 2의 인덱스를 계속해서 업데이트
            }
        }
        
        // 2가 하나도 없다면 [-1] 반환
        if (firstIndex == -1) {
            return new int[]{-1};
        }
        
        // 첫 번째 인덱스부터 마지막 인덱스까지의 부분 배열을 반환
        int[] result = new int[lastIndex - firstIndex + 1];
        for (int i = firstIndex; i <= lastIndex; i++) {
            result[i - firstIndex] = arr[i];
        }
        
        return result;
    }
}
