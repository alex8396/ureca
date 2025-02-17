class Solution {
    public int solution(String before, String after) {
        // 문자열을 정렬하여 비교
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        
        // 두 배열을 정렬
        java.util.Arrays.sort(beforeArr);
        java.util.Arrays.sort(afterArr);
        
        // 정렬된 배열이 같으면 anagram이므로 1을 반환
        if (new String(beforeArr).equals(new String(afterArr))) {
            return 1;
        }
        
        // 다르면 0을 반환
        return 0;
    }
}
