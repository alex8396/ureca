class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0; // 원소를 더할 sum 변수 선언

        // numbers 배열을 순차적으로 순회하며 합을 구합니다.
        for (int num : numbers) {
            sum += num; // 현재 원소를 sum에 더합니다.
            if (sum > n) { // sum이 n을 초과하면 그 즉시 반환
                return sum;
            }
        }

        return sum; // 배열을 모두 더한 결과를 반환 (n보다 커지지 않으면)
    }
}
