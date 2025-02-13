import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // num_list의 첫 번째 원소부터 n번째 원소까지 포함하는 부분 배열을 반환
        return Arrays.copyOfRange(num_list, 0, n);
    }
}
