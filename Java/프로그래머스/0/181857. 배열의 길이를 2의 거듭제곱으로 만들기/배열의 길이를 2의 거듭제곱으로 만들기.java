class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int nextPowerOfTwo = 1;

        // 가장 작은 2의 거듭제곱을 찾기
        while (nextPowerOfTwo < n) {
            nextPowerOfTwo *= 2;
        }

        // 필요한 개수만큼 0을 추가
        int[] answer = new int[nextPowerOfTwo];
        for (int i = 0; i < n; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}
