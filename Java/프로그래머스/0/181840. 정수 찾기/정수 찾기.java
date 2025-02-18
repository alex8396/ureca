import java.util.Arrays;

class Solution {
    public int solution(int[] num_list, int n) {
        // num_list 배열에 n이 있는지 확인
        if (Arrays.stream(num_list).anyMatch(x -> x == n)) {
            return 1;
        } else {
            return 0;
        }
    }
}
