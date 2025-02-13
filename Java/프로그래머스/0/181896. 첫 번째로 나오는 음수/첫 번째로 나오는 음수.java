class Solution {
    public int solution(int[] num_list) {
        // 배열을 순차적으로 탐색
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i; // 첫 번째 음수의 인덱스 반환
            }
        }
        return -1; // 음수가 없으면 -1 반환
    }
}
