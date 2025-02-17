class Solution {
    public int solution(String my_string) {
        int sum = 0; // 합계를 저장할 변수

        for (char c : my_string.toCharArray()) { // 문자열을 문자 배열로 변환 후 순회
            if (Character.isDigit(c)) { // 문자가 숫자인지 확인
                sum += c - '0'; // 문자 '0'을 빼서 정수로 변환 후 합산
            }
        }

        return sum;
    }
}
