import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers); // 배열을 정렬 (오름차순)

        int n = numbers.length;
        int max1 = numbers[n - 1] * numbers[n - 2]; // 가장 큰 두 수의 곱
        int max2 = numbers[0] * numbers[1]; // 가장 작은 두 수의 곱 (음수일 가능성 고려)

        return Math.max(max1, max2); // 둘 중 최댓값 반환
    }
}
