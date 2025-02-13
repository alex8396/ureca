import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        // 아직 마치지 못한 일을 저장할 리스트
        List<String> answerList = new ArrayList<>();

        // todo_list 배열을 순회하면서 finished[i]가 false인 경우만 추가
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                answerList.add(todo_list[i]);
            }
        }

        // answerList를 배열로 변환하여 반환
        // answerList의 크기로 배열을 새로 생성하여 반환
        return answerList.toArray(new String[answerList.size()]);
    }
}
