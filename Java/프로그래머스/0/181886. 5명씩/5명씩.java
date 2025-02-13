import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
        // 이름을 담을 리스트
        List<String> answerList = new ArrayList<>();

        // 5명씩 그룹을 만들어서 각 그룹의 첫 번째 사람을 answerList에 추가
        for (int i = 0; i < names.length; i += 5) {
            answerList.add(names[i]);  // 5명씩 묶고 첫 번째 사람 추가
        }

        // answerList를 배열로 변환해서 반환
        return answerList.toArray(new String[answerList.size()]);
    }
}
