import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                // 짝수 인덱스일 경우: query[i] 이후부터 자르기
                if (query[i] + 1 < arr.length) {
                    arr = Arrays.copyOfRange(arr, query[i] + 1, arr.length);
                } else {
                    arr = new int[0]; // 잘못된 범위 처리
                    break;
                }
            } else {
                // 홀수 인덱스일 경우: query[i] 이전까지 자르기
                if (query[i] < arr.length) {
                    arr = Arrays.copyOfRange(arr, 0, query[i]);
                } else {
                    arr = new int[0]; // 잘못된 범위 처리
                    break;
                }
            }
        }
        
        // 결과가 비어있으면 [-1]을 반환
        return arr.length == 0 ? new int[]{-1} : arr;
    }
}
