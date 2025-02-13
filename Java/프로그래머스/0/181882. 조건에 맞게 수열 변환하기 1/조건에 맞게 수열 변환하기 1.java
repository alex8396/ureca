class Solution {
    public int[] solution(int[] arr) {
        // 결과를 저장할 배열을 선언
        int[] answer = new int[arr.length];

        // 배열의 각 원소에 대해 조건에 맞는 연산을 수행
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num >= 50 && num % 2 == 0) {
                // 50 이상인 짝수일 경우 2로 나누기
                answer[i] = num / 2;
            } else if (num < 50 && num % 2 != 0) {
                // 50 미만인 홀수일 경우 2를 곱하기
                answer[i] = num * 2;
            } else {
                // 조건에 맞지 않으면 원래 값 그대로
                answer[i] = num;
            }
        }

        // 변환된 배열을 반환
        return answer;
    }
}
