import java.util.ArrayList;  // ArrayList 클래스 임포트

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        // 빈 배열 X
        ArrayList<Integer> X = new ArrayList<>();
        
        // flag 배열을 순회하며 X 배열을 업데이트
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                // flag[i]가 true라면 arr[i] 값을 arr[i] * 2번 추가
                for (int j = 0; j < arr[i] * 2; j++) {
                    X.add(arr[i]);
                }
            } else {
                // flag[i]가 false라면 arr[i] 만큼 마지막 원소 삭제
                for (int j = 0; j < arr[i]; j++) {
                    X.remove(X.size() - 1);
                }
            }
        }
        
        // X를 배열로 변환하여 반환
        int[] answer = new int[X.size()];
        for (int i = 0; i < X.size(); i++) {
            answer[i] = X.get(i);
        }
        
        return answer;
    }
}
