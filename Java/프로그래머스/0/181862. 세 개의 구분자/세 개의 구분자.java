import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        // "a", "b", "c"를 구분자로 사용하는 정규 표현식
        String[] parts = myStr.split("[abc]");
        
        // 결과를 저장할 리스트
        ArrayList<String> result = new ArrayList<>();
        
        // 나누어진 문자열이 비어있지 않으면 결과 리스트에 추가
        for (String part : parts) {
            if (!part.isEmpty()) {
                result.add(part);
            }
        }
        
        // 결과가 비어 있으면 "EMPTY" 반환
        if (result.isEmpty()) {
            return new String[] {"EMPTY"};
        }
        
        // 결과 리스트를 배열로 변환하여 반환
        return result.toArray(new String[0]);
    }
}
