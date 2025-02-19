import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        return Arrays.stream(strArr)
                     .filter(str -> !str.contains("ad")) // "ad" 포함된 문자열 제거
                     .toArray(String[]::new); // 배열 변환 후 반환
    }
}
