import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        // 배열을 오름차순으로 정렬
        Arrays.sort(array);
        
        // 배열의 중간 인덱스를 구하고 해당 값을 반환
        int midIndex = array.length / 2;
        return array[midIndex]; // 중앙값 반환
    }
}
