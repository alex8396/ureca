class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder currentNumber = new StringBuilder(); // 현재 숫자를 저장할 변수

        // 문자열을 한 문자씩 탐색
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) { // 문자가 숫자라면
                currentNumber.append(c); // 숫자를 currentNumber에 추가
            } else {
                if (currentNumber.length() > 0) { // 숫자가 존재한다면
                    answer += Integer.parseInt(currentNumber.toString()); // 숫자 더하기
                    currentNumber.setLength(0); // currentNumber 초기화
                }
            }
        }

        // 마지막에 남아있는 숫자 처리
        if (currentNumber.length() > 0) {
            answer += Integer.parseInt(currentNumber.toString());
        }

        return answer;
    }
}
