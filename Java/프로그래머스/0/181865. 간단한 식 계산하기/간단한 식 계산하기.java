class Solution {
    public int solution(String binomial) {
        // 공백을 기준으로 문자열을 나눔
        String[] parts = binomial.split(" ");
        
        // a, b는 각각 첫 번째와 세 번째 부분
        int a = Integer.parseInt(parts[0]);
        String op = parts[1];
        int b = Integer.parseInt(parts[2]);
        
        // 연산자에 따라 계산
        if (op.equals("+")) {
            return a + b;
        } else if (op.equals("-")) {
            return a - b;
        } else if (op.equals("*")) {
            return a * b;
        }
        
        return 0;  // 기본적으로 리턴할 값 (어떤 오류가 발생할 경우)
    }
}
