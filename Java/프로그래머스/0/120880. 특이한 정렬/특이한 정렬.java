import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {
        // Integer[]로 변환
        Integer[] numlistObj = Arrays.stream(numlist)
                                      .boxed()
                                      .toArray(Integer[]::new);

        // 배열을 정렬하는 기준을 정의
        Arrays.sort(numlistObj, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                // 1. n과의 거리 차이 비교
                int distA = Math.abs(a - n);
                int distB = Math.abs(b - n);

                // 2. 거리 차이가 같으면, 더 큰 수가 먼저 오게 정렬
                if (distA == distB) {
                    return b - a;  // 내림차순 (큰 수가 앞에)
                } else {
                    return distA - distB;  // 거리 차이 오름차순
                }
            }
        });

        // Integer[]를 int[]로 다시 변환
        return Arrays.stream(numlistObj)
                     .mapToInt(Integer::intValue)
                     .toArray();
    }
}
