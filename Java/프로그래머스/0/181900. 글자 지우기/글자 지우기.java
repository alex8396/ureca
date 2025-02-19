import java.util.Arrays;  // Arrays 클래스를 임포트합니다.

class Solution {
    public String solution(String my_string, int[] indices) {
        // StringBuilder로 문자 수정이 용이하도록 변환
        StringBuilder sb = new StringBuilder(my_string);
        
        // 인덱스 배열을 오름차순으로 정렬
        Arrays.sort(indices);
        
        // 역순으로 인덱스를 삭제 (오른쪽부터 왼쪽으로)
        for (int i = indices.length - 1; i >= 0; i--) {
            sb.deleteCharAt(indices[i]);
        }
        
        return sb.toString(); // 수정된 문자열 반환
    }
}
