import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers); // 배열 정렬
        int length = numbers.length;
        return numbers[length - 1] * numbers[length - 2]; // 가장 큰 두 수의 곱 반환
    }
}
