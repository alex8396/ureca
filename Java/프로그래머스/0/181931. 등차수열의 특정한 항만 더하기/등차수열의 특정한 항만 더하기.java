class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        // included 배열을 순회
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                // 등차수열의 i+1 번째 항을 계산하고 더함
                answer += a + (i * d);
            }
        }
        
        return answer; // 최종적으로 더한 값을 반환
    }
}
