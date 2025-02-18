import java.util.Arrays;  // Arrays 클래스를 import

class Solution {
    public int[] solution(int[] num_list) {
        // 배열을 오름차순으로 정렬
        Arrays.sort(num_list);
        
        // 가장 작은 5개를 제외한 나머지 배열을 새 배열로 복사
        int[] answer = new int[num_list.length - 5];
        for (int i = 5; i < num_list.length; i++) {
            answer[i - 5] = num_list[i];
        }
        
        return answer;
    }
}
