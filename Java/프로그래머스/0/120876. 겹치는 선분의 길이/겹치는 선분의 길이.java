class Solution {
    public int solution(int[][] lines) {
        int[] count = new int[201]; // -100~100까지 201개의 요소로 배열 생성
        int answer = 0;
        
        // 각 선분에 대해, 그 선분이 포함되는 구간을 카운트
        for (int i = 0; i < 3; i++) {
            int start = lines[i][0] + 100; // -100을 offset으로 추가하여 인덱스 범위 맞추기
            int end = lines[i][1] + 100;   // 100을 추가하여 음수를 양수로 변환
            for (int j = start; j < end; j++) {
                count[j]++;
            }
        }
        
        // 겹치는 구간을 카운트 (두 선분 이상 겹치는 구간)
        for (int i = 0; i < 201; i++) {
            if (count[i] > 1) {
                answer++;
            }
        }
        
        return answer;
    }
}
