import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // stk를 ArrayList로 선언 (동적으로 크기가 조절됨)
        ArrayList<Integer> stk = new ArrayList<>();
        
        // 배열을 순차적으로 탐색
        for (int i = 0; i < arr.length; i++) {
            // stk가 비어있으면 arr[i]를 추가
            while (!stk.isEmpty() && stk.get(stk.size() - 1) >= arr[i]) {
                // stk의 마지막 원소가 arr[i]보다 크거나 같으면 제거
                stk.remove(stk.size() - 1);
            }
            // arr[i]를 stk에 추가
            stk.add(arr[i]);
        }
        
        // 결과를 배열로 반환
        int[] result = new int[stk.size()];
        for (int i = 0; i < stk.size(); i++) {
            result[i] = stk.get(i);
        }
        return result;
    }
}
