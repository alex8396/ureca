class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500; // 아이스 아메리카노의 잔 수
        answer[1] = money % 5500; // 남은 돈
        return answer;
    }
}
