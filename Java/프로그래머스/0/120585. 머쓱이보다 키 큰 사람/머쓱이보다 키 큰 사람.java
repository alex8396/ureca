class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        // 배열을 순회하면서 height보다 큰 값이 있는지 확인
        for (int personHeight : array) {
            if (personHeight > height) {
                answer++;  // 키가 큰 사람이 있으면 카운트 증가
            }
        }
        
        return answer;  // 키가 큰 사람 수를 반환
    }
}
