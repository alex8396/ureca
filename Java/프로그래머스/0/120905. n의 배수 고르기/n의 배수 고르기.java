import java.util.Arrays; // 추가

class Solution {
    public int[] solution(int n, int[] numlist) {
        // numlist에서 n의 배수만 필터링
        return Arrays.stream(numlist) // 스트림을 사용하여 배열 처리
                     .filter(num -> num % n == 0) // n의 배수만 필터링
                     .toArray(); // 다시 배열로 변환하여 반환
    }
}
