class Solution {
    public int[] solution(int n, int k) {
        int size = n / k; // k의 배수 개수 계산
        int[] answer = new int[size]; // 해당 크기의 배열 생성
        
        for (int i = 0; i < size; i++) {
            answer[i] = k * (i + 1); // k의 배수를 순서대로 저장
        }
        
        return answer;
    }
}
