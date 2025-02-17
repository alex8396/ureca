class Solution {
    public int[] solution(int n) {
        // n 이하의 홀수 개수 계산
        int size = (n + 1) / 2;
        
        // 결과 배열 생성
        int[] answer = new int[size];

        // 1부터 2씩 증가하는 홀수를 배열에 채우기
        for (int i = 0; i < size; i++) {
            answer[i] = 2 * i + 1;
        }

        return answer;
    }
}
