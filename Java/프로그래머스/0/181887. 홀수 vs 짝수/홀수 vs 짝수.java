class Solution {
    public int solution(int[] num_list) {
        int oddSum = 0;  // 홀수 번째 원소들의 합
        int evenSum = 0; // 짝수 번째 원소들의 합

        // 리스트의 각 원소를 순차적으로 확인
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {  // 홀수 번째 인덱스 (0, 2, 4, ...)
                oddSum += num_list[i];
            } else {  // 짝수 번째 인덱스 (1, 3, 5, ...)
                evenSum += num_list[i];
            }
        }

        // 홀수 번째 합과 짝수 번째 합 중 큰 값을 반환
        return Math.max(oddSum, evenSum);
    }
}
