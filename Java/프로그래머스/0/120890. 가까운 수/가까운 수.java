class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int minDifference = Math.abs(array[0] - n);
        
        // array의 각 원소와 n의 차이를 계산
        for (int num : array) {
            int currentDifference = Math.abs(num - n);
            
            // 현재 차이가 더 작거나, 차이가 같고 더 작은 수일 경우
            if (currentDifference < minDifference || 
               (currentDifference == minDifference && num < answer)) {
                minDifference = currentDifference;
                answer = num;
            }
        }
        
        return answer;
    }
}
