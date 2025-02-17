class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        // 배열의 모든 원소를 순차적으로 탐색
        for (int num : array) {
            if (num == n) {
                answer++; // n과 일치하면 카운트 증가
            }
        }
        return answer;
    }
}
