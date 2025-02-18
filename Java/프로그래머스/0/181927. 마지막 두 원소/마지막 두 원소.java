class Solution {
    public int[] solution(int[] num_list) {
        // 마지막 원소와 그 전 원소를 비교
        int last = num_list[num_list.length - 1];
        int secondLast = num_list[num_list.length - 2];
        
        // 새로운 리스트의 크기는 기존 리스트의 크기 + 1
        int[] answer = new int[num_list.length + 1];
        
        // 기존 리스트의 원소들을 그대로 복사
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        // 조건에 맞게 마지막 원소를 추가
        if (last > secondLast) {
            answer[num_list.length] = last - secondLast;
        } else {
            answer[num_list.length] = last * 2;
        }
        
        return answer;
    }
}
