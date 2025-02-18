class Solution {
    public int[] solution(int start_num, int end_num) {
        // end_num - start_num + 1개의 숫자를 포함하는 배열 생성
        int[] answer = new int[end_num - start_num + 1];
        
        // start_num부터 end_num까지 차례대로 배열에 담기
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start_num + i;
        }
        
        return answer;
    }
}
