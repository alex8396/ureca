import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty()) {
                stk.push(arr[i]);
            } else {
                if (stk.peek() == arr[i]) {
                    stk.pop();  // 마지막 원소와 같으면 pop
                } else {
                    stk.push(arr[i]);  // 다르면 push
                }
            }
        }
        
        // stk이 비어있으면 [-1]을 return, 아니면 stk의 내용을 배열로 변환하여 반환
        if (stk.isEmpty()) {
            return new int[] {-1};
        } else {
            int[] answer = new int[stk.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = stk.get(i);
            }
            return answer;
        }
    }
}
