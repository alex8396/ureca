import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        // 'l'과 'r'의 인덱스를 각각 찾기
        int lIndex = -1;
        int rIndex = -1;
        
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l") && lIndex == -1) {
                lIndex = i;
            }
            if (str_list[i].equals("r") && rIndex == -1) {
                rIndex = i;
            }
        }
        
        // 'l'과 'r'이 모두 없는 경우 빈 배열 반환
        if (lIndex == -1 && rIndex == -1) {
            return new String[]{};
        }
        
        // 'l'이 먼저 발견된 경우
        if (lIndex != -1 && (rIndex == -1 || lIndex < rIndex)) {
            // 'l'의 왼쪽에 있는 부분 배열 반환
            return Arrays.copyOfRange(str_list, 0, lIndex);
        }
        
        // 'r'이 먼저 발견된 경우
        if (rIndex != -1 && (lIndex == -1 || rIndex < lIndex)) {
            // 'r'의 오른쪽에 있는 부분 배열 반환
            return Arrays.copyOfRange(str_list, rIndex + 1, str_list.length);
        }
        
        // 기본적으로 빈 배열을 반환할 수 있음
        return new String[]{};
    }
}
