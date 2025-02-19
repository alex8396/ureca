import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        // 첫 번째 구간 추출
        int[] part1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        // 두 번째 구간 추출
        int[] part2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);
        
        // 두 배열을 합쳐서 반환
        return IntStream.concat(Arrays.stream(part1), Arrays.stream(part2)).toArray();
    }
}
