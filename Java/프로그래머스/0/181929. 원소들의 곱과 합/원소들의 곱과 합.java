class Solution {
    public int solution(int[] num_list) {
        int product = 1;  // 모든 원소들의 곱을 저장할 변수
        int sum = 0;      // 모든 원소들의 합을 저장할 변수
        
        // num_list의 모든 원소에 대해 곱과 합을 계산
        for (int num : num_list) {
            product *= num;  // 곱 계산
            sum += num;      // 합 계산
        }
        
        // 곱이 합의 제곱보다 작은지 비교
        if (product < sum * sum) {
            return 1;  // 곱이 합의 제곱보다 작으면 1
        } else {
            return 0;  // 그렇지 않으면 0
        }
    }
}
