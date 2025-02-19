import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] strArr) {
        // 길이별 문자열 개수를 저장할 Map
        Map<Integer, Integer> lengthCount = new HashMap<>();
        
        // strArr의 각 문자열에 대해 길이를 카운트
        for (String str : strArr) {
            int length = str.length();
            lengthCount.put(length, lengthCount.getOrDefault(length, 0) + 1);
        }
        
        // 가장 많이 나타나는 문자열 길이 그룹의 개수 찾기
        int maxGroupSize = 0;
        for (int count : lengthCount.values()) {
            maxGroupSize = Math.max(maxGroupSize, count);
        }
        
        return maxGroupSize;
    }
}
