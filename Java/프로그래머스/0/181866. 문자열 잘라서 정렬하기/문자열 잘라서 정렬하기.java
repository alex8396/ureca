import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String myString) {
        // "x"로 분리한 후 빈 문자열을 필터링하여 새로운 배열을 생성
        String[] parts = myString.split("x");
        
        // 빈 문자열을 제외한 부분만 필터링
        ArrayList<String> resultList = new ArrayList<>();
        for (String part : parts) {
            if (!part.isEmpty()) {
                resultList.add(part);
            }
        }
        
        // 리스트를 사전순으로 정렬
        Collections.sort(resultList);
        
        // 정렬된 리스트를 배열로 변환하여 반환
        String[] answer = resultList.toArray(new String[resultList.size()]);
        return answer;
    }
}
