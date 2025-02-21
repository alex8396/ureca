class Solution {
    public int[] solution(int num, int total) {
        // 연속된 수의 합을 구하는 첫 번째 수 x를 계산
        int firstNum = (total - (num * (num - 1)) / 2) / num;

        // 결과 배열 생성
        int[] answer = new int[num];
        
        // 연속된 수열 생성
        for (int i = 0; i < num; i++) {
            answer[i] = firstNum + i;
        }
        
        return answer;
    }
}
