class Solution {
    public int[] solution(int[] num_list, int n) {
        // 결과를 담을 리스트
        int[] answer = new int[(num_list.length + n - 1) / n]; // 필요한 크기 계산

        // num_list에서 n간격으로 원소를 가져오기
        int idx = 0;
        for (int i = 0; i < num_list.length; i += n) {
            answer[idx++] = num_list[i]; // 해당 원소를 answer 배열에 추가
        }

        return answer;
    }
}
