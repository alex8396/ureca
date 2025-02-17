class Solution {
    public int[] solution(int[] numbers) {
        // 주어진 배열의 길이를 이용해 결과 배열의 크기를 설정
        int[] answer = new int[numbers.length];
        
        // numbers 배열을 순회하며 각 원소를 두 배로 만들기
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2; // 각 원소에 두 배를 곱함
        }
        
        return answer; // 결과 배열 반환
    }
}
