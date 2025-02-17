class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] charArray = my_string.toCharArray(); // 문자열을 문자 배열로 변환

        // 문자 교환 (swap)
        char temp = charArray[num1];
        charArray[num1] = charArray[num2];
        charArray[num2] = temp;

        return new String(charArray); // 문자 배열을 문자열로 변환하여 반환
    }
}
