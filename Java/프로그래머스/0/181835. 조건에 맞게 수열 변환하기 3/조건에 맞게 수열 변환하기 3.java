class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];  // 결과 배열 선언
        
        // k가 홀수인 경우
        if (k % 2 != 0) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] * k;  // 각 원소에 k를 곱함
            }
        }
        // k가 짝수인 경우
        else {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] + k;  // 각 원소에 k를 더함
            }
        }
        
        return answer;  // 변환된 배열 반환
    }
}
