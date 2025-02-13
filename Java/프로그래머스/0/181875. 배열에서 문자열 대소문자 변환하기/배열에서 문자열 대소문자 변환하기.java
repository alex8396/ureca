class Solution {
    public String[] solution(String[] strArr) {
        // 새로운 배열을 만들기 위해 기존 배열 크기로 생성
        String[] answer = new String[strArr.length];
        
        // 배열의 각 원소를 처리
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                // 짝수번째 인덱스는 소문자로 변경
                answer[i] = strArr[i].toLowerCase();
            } else {
                // 홀수번째 인덱스는 대문자로 변경
                answer[i] = strArr[i].toUpperCase();
            }
        }
        
        return answer;
    }
}
