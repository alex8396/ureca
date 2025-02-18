class Solution {
    public int[] solution(String myString) {
        // 문자열을 'x' 기준으로 나누기
        String[] parts = myString.split("x", -1); // -1로 끝까지 나누기
        
        // 나누어진 각 부분의 길이를 구하기
        int[] answer = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            answer[i] = parts[i].length();  // 각 부분 문자열의 길이를 저장
        }
        
        return answer;
    }
}
