class Solution {
    public String solution(String[] arr) {
        StringBuilder answer = new StringBuilder(); // StringBuilder는 문자열을 이어붙이는 데 유리함

        // 배열의 각 원소를 순서대로 추가
        for (String s : arr) {
            answer.append(s);
        }
        
        // 최종 문자열 반환
        return answer.toString();
    }
}
