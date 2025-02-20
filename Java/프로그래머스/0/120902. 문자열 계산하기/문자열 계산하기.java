class Solution {
    public int solution(String my_string) {
        String[] tokens = my_string.split(" "); // 공백을 기준으로 문자열을 나눔
        int answer = Integer.parseInt(tokens[0]); // 첫 번째 숫자를 결과값으로 초기화
        
        for (int i = 1; i < tokens.length; i += 2) { // 연산자는 홀수 번째 인덱스
            String operator = tokens[i];
            int num = Integer.parseInt(tokens[i + 1]); // 연산자 다음 숫자
            
            if (operator.equals("+")) {
                answer += num;
            } else if (operator.equals("-")) {
                answer -= num;
            }
        }
        return answer;
    }
}
