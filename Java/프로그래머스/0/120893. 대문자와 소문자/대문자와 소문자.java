class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder(); // 문자열을 효율적으로 다루기 위해 StringBuilder 사용

        for (char c : my_string.toCharArray()) { // 문자열을 문자 배열로 변환하여 반복
            if (Character.isUpperCase(c)) { // 대문자인 경우
                result.append(Character.toLowerCase(c)); // 소문자로 변환하여 추가
            } else { // 소문자인 경우
                result.append(Character.toUpperCase(c)); // 대문자로 변환하여 추가
            }
        }
        
        return result.toString(); // 변환된 문자열 반환
    }
}
