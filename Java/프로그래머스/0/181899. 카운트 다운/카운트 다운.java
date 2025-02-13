class Solution {
    public int[] solution(int start_num, int end_num) {
        int size = start_num - end_num + 1; // 배열의 크기
        int[] answer = new int[size]; // 배열 생성
        
        for (int i = 0; i < size; i++) {
            answer[i] = start_num - i; // 감소하는 값 저장
        }
        
        return answer;
    }
}
