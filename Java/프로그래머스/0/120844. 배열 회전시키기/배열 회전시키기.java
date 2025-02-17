class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if (direction.equals("right")) {
            // 오른쪽으로 회전
            answer[0] = numbers[numbers.length - 1]; // 마지막 원소를 맨 앞에
            for (int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[i - 1]; // 나머지 원소들을 한 칸씩 뒤로 밀기
            }
        } else if (direction.equals("left")) {
            // 왼쪽으로 회전
            answer[numbers.length - 1] = numbers[0]; // 첫 번째 원소를 맨 뒤에
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i] = numbers[i + 1]; // 나머지 원소들을 한 칸씩 앞으로 밀기
            }
        }
        
        return answer;
    }
}
