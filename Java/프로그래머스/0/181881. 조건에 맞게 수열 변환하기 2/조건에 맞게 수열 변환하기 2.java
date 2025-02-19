import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] prevArr = new int[arr.length];  // 이전 배열 상태 저장
        
        while (true) {
            answer++;
            // arr 배열을 복사해서 prevArr로 저장
            System.arraycopy(arr, 0, prevArr, 0, arr.length);
            
            // 배열을 변환
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;  // 50 이상 짝수는 2로 나누기
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;  // 50 미만 홀수는 2배하고 1 더하기
                }
            }
            
            // 현재 변환된 배열과 이전 배열을 비교
            if (Arrays.equals(arr, prevArr)) {
                break;  // 배열이 변하지 않으면 반복 종료
            }
        }
        
        return answer - 1;  // 마지막에 불필요하게 증가한 값을 빼기
    }
}
