import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        // 배열을 정렬하여 가장 큰 변을 찾는다
        Arrays.sort(sides);
        
        // 가장 큰 변은 sides[2]이고, 나머지 두 변의 합은 sides[0] + sides[1]이다
        if (sides[0] + sides[1] > sides[2]) {
            return 1; // 삼각형을 만들 수 있음
        } else {
            return 2; // 삼각형을 만들 수 없음
        }
    }
}
