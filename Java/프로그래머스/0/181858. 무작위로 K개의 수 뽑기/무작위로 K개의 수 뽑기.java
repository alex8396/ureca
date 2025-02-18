import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(); // 순서를 유지하는 Set

        for (int num : arr) {
            if (set.size() < k) { // k개까지만 추가
                set.add(num);
            }
        }

        int[] answer = new int[k]; 
        int i = 0;
        
        // Set 요소를 배열로 옮기기
        for (int num : set) {
            answer[i++] = num;
        }

        // 나머지 부분을 -1로 채우기
        while (i < k) {
            answer[i++] = -1;
        }

        return answer;
    }
}
