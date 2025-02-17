class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        
        // 나이를 문자열로 변환
        while (age > 0) {
            int digit = age % 10; // 나이의 마지막 자릿수
            answer.append((char) ('a' + digit)); // 해당 숫자에 맞는 알파벳을 추가
            age /= 10; // 나이에서 마지막 자릿수를 제거
        }

        // 결과는 역순으로 계산되므로, 뒤집어서 반환
        return answer.reverse().toString();
    }
}
