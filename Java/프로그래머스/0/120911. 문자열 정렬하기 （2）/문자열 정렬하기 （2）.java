import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        // 1. 문자열을 소문자로 변환
        my_string = my_string.toLowerCase();
        
        // 2. 문자 배열로 변환 후 정렬
        char[] charArray = my_string.toCharArray();
        Arrays.sort(charArray);
        
        // 3. 정렬된 문자 배열을 다시 문자열로 변환하여 반환
        return new String(charArray);
    }
}
